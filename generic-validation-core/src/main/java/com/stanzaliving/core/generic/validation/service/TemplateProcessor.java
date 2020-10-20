package com.stanzaliving.core.generic.validation.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.exception.NoRecordException;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.generic.constants.GenericConstants;
import com.stanzaliving.core.generic.validation.dtos.*;
import com.stanzaliving.core.generic.validation.entity.Templates;
import com.stanzaliving.core.generic.validation.enums.*;
import com.stanzaliving.core.generic.validation.fieldProcessors.AdaptableProcessor;
import com.stanzaliving.core.generic.validation.fieldProcessors.ApprovalProcessor;
import com.stanzaliving.core.generic.validation.fieldProcessors.TemplateListSection;
import com.stanzaliving.core.generic.validation.fieldProcessors.ValueChecker;
import com.stanzaliving.core.generic.validation.filter.TemplateFilter;
import com.stanzaliving.core.generic.validation.utility.FieldDecoder;
import com.stanzaliving.core.generic.validation.utility.FieldValidator;
import com.stanzaliving.core.generic.validation.utility.ValueAdapters;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.util.Pair;


import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Log4j2
public abstract class TemplateProcessor {

//    @Autowired
//    private MongoTemplate mongoTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public abstract Map<String,Templates> getTemplates(TemplateFilter templateFilter, String templateName);
//    {
//
//        Query query = templateFilter.getFilterCriterion();
//        log.info("Template Request Query {}",query);
//        Map<String, Templates> templates = mongoTemplate.find(query, Templates.class).stream().collect(Collectors.toMap(f->f.getTemplateName(), Function.identity()));
//        if(MapUtils.isEmpty(templates) || Objects.isNull(templates.get(templateName))) {
//            log.error("No Templates configured for the provided filters {}",templateFilter.getFormattedString());
//            throw new NoRecordException("No Such Combination exist for provided filters "+templateFilter.getFormattedString());
//        }
//        return templates;
//    }

    public List<String> getAvailableFields(TemplateFilter templateFilter, String templateName){
        log.info("Request to get available fields for Form {} {}",templateFilter,templateName);

        Map<String, Templates> templates = getTemplates(templateFilter,templateName);
        List<String> fields = new ArrayList<>();
        fillAvailableFields(templateName,"",templates,fields);
        return fields;
    }
    private void fillAvailableFields(String templateName, String path, Map<String,Templates> templates, List<String> availableFields){
        Templates template = templates.get(templateName);
        if(StringUtils.isEmpty(path))
            path = templateName;
        else
            path = path+"."+templateName;

        for (TemplateField templateField : template.getFields()) {
//            log.info("Template Field {}",templateField);
            if(templateField.getFieldType()==FieldType.TEMPLATE)
            {
                fillAvailableFields(templateField.getFieldName(),path,templates,availableFields);
            }else{
                String fieldName = path+"."+templateField.getFieldName(); //((StringUtils.isNotEmpty(path))?path+".":"")+templateField.getFieldName();
                availableFields.add(fieldName);
            }
        }
    }

    public Map<String, UiParentField> getBasicUIData(TemplateFilter templateFilter, String templateName,
                                                     Map<String,Object> additionalData, Object sourceClass, Map<String,Field> fieldMap) {

        log.info("Request to render UI Form {} {}",sourceClass,fieldMap);

        Map<String, Templates> templates = getTemplates(templateFilter,templateName);
        return getUiFields(templateName,templates,fieldMap,sourceClass,additionalData,sourceClass);
    }

//    private void test(String templateName, TemplateFilter templateFilter){
//        Query query = templateFilter.getFilterCriterion();
//        query.addCriteria(Criteria.where("templateName").is(templateName));
//        log.info("Query {}",query);
//        Templates template = mongoTemplate.findOne(query,Templates.class);
//        if(Objects.nonNull(template)){
//            template.getFields().stream().forEach(f->{
//                if(f.getFieldType()==FieldType.TEMPLATE)
//                    test(f.getFieldName(),templateFilter);
//            });
//        }
//    }

    //Todo:Need to update this method and the verify entity as there are other changes which might not be included in this.
    public void verifyEntityWithTemplate(TemplateFilter templateFilter,String templateName, List<String> errors, Object sourceClass,
                                         Map<String,Field> fieldMap, boolean allowSkipOnNewFields) throws MalFormedRecordException {

        log.info("Request to Verify data from CSV {} {}",sourceClass,fieldMap);

        Map<String, Templates> templates = getTemplates(templateFilter,templateName);
        verifyEntityData(templateName,templates,errors,fieldMap,sourceClass,sourceClass,allowSkipOnNewFields);
    }

    public Pair<Boolean,Map<String, UiParentField>> storeSubmittedUIData(TemplateFilter templateFilter, String templateName,
                                                                         Map<String,JsonNode> uiSubmittedDto, boolean isDraft, boolean isSaveOnError,
                                                                         ErrorInfo errorInfo, Map<String,Object> additionalData,
                                                                         Object sourceClass, Map<String,Field> fieldMap, boolean allowSkipOnNewFields){
        log.info("Request to Store data Submitted with validations {} {}",sourceClass,fieldMap);

        Map<String, Templates> templates = getTemplates(templateFilter,templateName);
        return verifyAndStoreData(uiSubmittedDto,templateName,templates, isDraft,errorInfo,isSaveOnError,
                additionalData,fieldMap,sourceClass,allowSkipOnNewFields,sourceClass);
    }


    public abstract List<Object> getListOptions(FieldOptionProvider fieldOptionProvider, Map<String,Object> additionalData);


    /*
        The limitations here are:
        1. Suppose we have some values already saved before. now the use submits the form again with errored values:
         then, we will also overwrite the existing values with nulls, we can overcome this behaviour by avoid saving draft in case of there are error in fields.

        2. We cannot model our entity structure in two level of nesting within same field such as:
        List<List<X>> or List<MAP>, if we want to do that, we shall do like
        List<CustomClass>
        wher CustomClass
        CustomClass{
        List<X>
        }
        and so on and so forth.

     */





    public Pair<Boolean,Map<String, UiParentField>> storeApprovalData(TemplateFilter templateFilter, String templateName,
                                                                      Map<String,JsonNode> uiSubmittedDto,
                                                                      ErrorInfo errorInfo, Map<String,Object> additionalData,
                                                                      Object sourceClass, Map<String,Field> fieldMap, boolean allowSkipOnNewFields){
        log.info("Request to Store Approvals Submitted with validations {} {}",sourceClass,fieldMap);

        Map<String, Templates> templates = getTemplates(templateFilter,templateName);
        return processApproval(uiSubmittedDto,templateName,templates,errorInfo,
                additionalData,fieldMap,sourceClass,allowSkipOnNewFields,sourceClass);
    }

    private Pair<Boolean, Map<String, UiParentField>> processApproval(Map<String,JsonNode>  data, String templateName,
                                                                      Map<String, Templates> templates, ErrorInfo errorInfo, Map<String,Object> additionalData,
                                                                      Map<String,Field> fields, Object sourceClass, boolean allowSkipNewFields, Object baseObject){

        log.info("Processing Template {} ",templateName);
        final int currErrors = errorInfo.getNumErrors();
        Map<String, UiParentField> uiFieldMap = new LinkedHashMap<>();
        Templates template = templates.get(templateName);

        boolean mainDataPresent = MapUtils.isNotEmpty(data);

        for (TemplateField templateField : template.getFields()) {

            log.info("Processing Field {}", templateField.getFieldName());

            if (Objects.isNull(fields.get(templateField.getFieldName()))) {
                log.error("Template field {} not found in Dto Struture, skip processing {}", templateField.getFieldName(), allowSkipNewFields);
                if (allowSkipNewFields)
                    continue;
                else
                    throw new StanzaException("Internal Error Occurred");
            }
            boolean dataPresent = mainDataPresent && Objects.nonNull(data.get(templateField.getFieldName())) && (!data.get(templateField.getFieldName()).isNull());
            FieldType subFieldType = templateField.getFieldSubType();
            Field field = fields.get(templateField.getFieldName());
            field.setAccessible(true);
            if(dataPresent) {
                switch (templateField.getFieldType()) {
                    case ADAPT:
                        UiField uiField = ValueAdapters.getValue(data.get(templateField.getFieldName()), UiField.class, objectMapper);
                        uiField.setErrorMsg(null);
                        uiField.setErrorOccurred(false);
                        if (templateField.isApprovable()) {
                            Object value = FieldDecoder.decodeAdaptableValue(uiField, templateField, objectMapper, errorInfo);
                            //Below case shall not happen
//                            if (Objects.isNull(value) && templateField.isMandatory())
//                                throw new StanzaException("Illegal operation, Mandatory field can't be blank when approvals start");
                            if (Objects.nonNull(value)) {
                                AdaptableProcessor approvalProcessor = (AdaptableProcessor) sourceClass;
                                uiField.setValue(objectMapper.valueToTree(approvalProcessor.updateApprovalData(uiField, templateField, value, additionalData, errorInfo)));
                            }
                        }
                        uiFieldMap.put(templateField.getFieldName(), uiField);

                        break;

                    case TEMPLATE:
                        log.info("Template Found {} {} {}", templateField.getFieldName(), templateField.getFieldSubType(), dataPresent);
                        UiParentField uiBasicField = ValueAdapters.convertValue(data.get(templateField.getFieldName()), new TypeReference<UiParentField>() {
                        }, objectMapper);
                        uiBasicField.setErrorMsg(null);
                        uiBasicField.setErrorOccurred(false);
                        if (templates.get(templateField.getFieldName()).getTemplateType() == TemplateType.MODAL) {
                            uiBasicField.setSkeleton(objectMapper.valueToTree(getUiFields(templateField.getFieldName(), templates, null, null, additionalData, baseObject)));
                        }

                        Object obj = ValueAdapters.getFieldVal(field, sourceClass);
                        if (subFieldType == FieldType.OBJECT) {
                            Class clazz = field.getType();
                            if (Objects.nonNull(obj)) {
                                if(templateField.isApprovable()){
                                    Map<String, Field> fieldMap = Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                                    Map<String, JsonNode> nestedStruct = ValueAdapters.convertValue(uiBasicField.getData(), new TypeReference<Map<String, JsonNode>>() {
                                    }, objectMapper);
                                    Pair<Boolean, Map<String, UiParentField>> nestedData = processApproval(nestedStruct, templateField.getFieldName(),
                                            templates, errorInfo, additionalData, fieldMap, obj, allowSkipNewFields, baseObject);
                                    uiBasicField.setErrorOccurred(nestedData.getFirst());
                                    uiBasicField.setData(objectMapper.valueToTree(nestedData.getSecond()));

                                    if (obj instanceof ApprovalProcessor)
                                        ((ApprovalProcessor)obj).processApproval(uiBasicField,templateField,additionalData,errorInfo);
                                }
                            }
                        } else if (subFieldType == FieldType.LIST) {
                            if (Objects.nonNull(obj)) {
                                if (templateField.isApprovable()) {
                                    if (obj instanceof ApprovalProcessor)
                                        ((ApprovalProcessor) obj).processApproval(uiBasicField, templateField, additionalData, errorInfo);
                                }
                            }
                        }

                        log.info("UiBaseField {}", uiBasicField);
                        uiFieldMap.put(templateField.getFieldName(), uiBasicField);
                        break;

                    default:
                        uiField = ValueAdapters.getValue(data.get(templateField.getFieldName()), UiField.class, objectMapper);
                        uiField.setErrorMsg(null);
                        uiField.setErrorOccurred(false);
                        uiFieldMap.put(templateField.getFieldName(), uiField);
                        break;
                }
            }

        }
        log.info("Finished Processing template {}",templateName);
        return Pair.of(currErrors < errorInfo.getNumErrors(),uiFieldMap);
    }

    private Pair<Boolean,Map<String, UiParentField>> verifyAndStoreData(Map<String,JsonNode>  data, String templateName,
                                                                        Map<String,Templates> templates, boolean isDraft,
                                                                        ErrorInfo errorInfo, boolean saveDraftOnError,
                                                                        Map<String,Object> additionalData,
                                                                        Map<String,Field> fields, Object sourceClass,
                                                                        boolean allowSkipNewFields, Object baseObject){

        log.info("Processing Template {} ",templateName);
//        log.info("Source class {}",baseObject);
        final int currErrors = errorInfo.getNumErrors();
        Map<String, UiParentField> uiFieldMap = new LinkedHashMap<>();
        Templates template = templates.get(templateName);

        boolean mainDataPresent = MapUtils.isNotEmpty(data);

        for (TemplateField templateField : template.getFields()) {

            log.info("Processing Field {}", templateField.getFieldName());

            if(Objects.isNull(fields.get(templateField.getFieldName())))
            {
                log.error("Template field {} not found in Dto Struture, skip processing {}",templateField.getFieldName(),allowSkipNewFields);
                if(allowSkipNewFields)
                    continue;
                else
                    throw new StanzaException("Internal Error Occurred");
            }
            boolean needed = templateField.isMandatory() && !isDraft;
            boolean dataPresent = mainDataPresent && Objects.nonNull(data.get(templateField.getFieldName())) && (!data.get(templateField.getFieldName()).isNull());
            FieldType subFieldType = templateField.getFieldSubType();

            Field field = fields.get(templateField.getFieldName());
            field.setAccessible(true);
            switch (templateField.getFieldType()) {
                case TEXT:
                case LIST:
                case ENUM:
                case BOOL:
                case DECIMAL:
                case YES_NO:
                case NONDECIMAL:
                case OBJECT:
                case ADAPT:

                    UiField uiField = null;

                    if (!dataPresent) {
                        uiField = getUiFieldTemplate(templateField, null, additionalData,null);
                        if(needed)
                        {
                            uiField.setErrorMsg("Field is mandatory");
                            updateErrorInfo(errorInfo);
                        }
                    } else {
                        uiField = ValueAdapters.getValue(data.get(templateField.getFieldName()), UiField.class,objectMapper);
                        uiField.setErrorMsg(null);
                        uiField.setErrorOccurred(false);
                        boolean decodeResult = FieldDecoder.decodeValue(uiField, templateField, needed, objectMapper, errorInfo,field,sourceClass,additionalData);
                        log.info("Decode status field-name:{} result:{}", templateField.getFieldName(), decodeResult);
//                        if (decodeResult && Objects.nonNull(uiField.getValue()))
//                            ValueAdapters.setFieldVal(templateName,templateField,field,sourceClass,uiField.getValue(),objectMapper);
                        fillOptions(templateField,additionalData,uiField);
                    }
                    uiFieldMap.put(templateField.getFieldName(), uiField);
                    break;

                case TEMPLATE:
                    log.info("Template Found {} {} {}",templateField.getFieldName(),templateField.getFieldSubType(),dataPresent);
                    UiParentField uiBasicField = null;
                    if (!dataPresent)
                    {
                        uiBasicField = getUiBasicField(templateField, templates.get(templateField.getFieldName()),additionalData);
                        if(needed){
                            uiBasicField.setErrorOccurred(true);
                            updateErrorInfo(errorInfo);
                        }
                    }else {
                        uiBasicField = ValueAdapters.convertValue(data.get(templateField.getFieldName()), new TypeReference<UiParentField>() {},objectMapper);
                        uiBasicField.setErrorMsg(null);
                        uiBasicField.setErrorOccurred(false);
                        /*
                            In case of MODAL type UI Section, we send a blank skeleton always as well as expect a blank skeleton recieve side as well.
                            MODAL type would always have to be LIST Of Section, because we will have to send a skeleton.
                         */
                        if(templates.get(templateField.getFieldName()).getTemplateType() == TemplateType.MODAL){
                            uiBasicField.setSkeleton(objectMapper.valueToTree(getUiFields(templateField.getFieldName(), templates, null, null, additionalData,baseObject)));
                        }
                        boolean dataSaved = false;
                        Object obj = ValueAdapters.getFieldVal(field,sourceClass);
                        if (subFieldType == FieldType.OBJECT) {
                            Class clazz = field.getType();
                            if(Objects.isNull(obj))
                                obj = ValueAdapters.instantiateClass(clazz,templateName,templateField,field);

                            Map<String, Field> fieldMap = Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                            Map<String, JsonNode> nestedStruct = ValueAdapters.convertValue(uiBasicField.getData(), new TypeReference<Map<String, JsonNode>>() {},objectMapper);
                            Pair<Boolean, Map<String, UiParentField>> nestedData = verifyAndStoreData(nestedStruct, templateField.getFieldName(),
                                    templates, isDraft, errorInfo, saveDraftOnError, additionalData, fieldMap, obj,allowSkipNewFields,baseObject);
                            if(!isDraft)
                                uiBasicField.setErrorOccurred(nestedData.getFirst());
                            uiBasicField.setData(objectMapper.valueToTree(nestedData.getSecond()));
                            if (!nestedData.getFirst() || saveDraftOnError)
                                dataSaved = ValueAdapters.setFieldValDirectly(templateName,templateField,field,sourceClass,obj);

                        } else if (subFieldType == FieldType.LIST) {
                            List<Object> objects = new ArrayList<>();
                            Class clazz = ValueAdapters.loadClass(templateField.getValueClass(),templateName,templateField,field);
                            Map<String, Field> fieldMap = Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));

                            List<Map<String, UiParentField>> nestedData = new ArrayList<>();
                            List<Map<String, JsonNode>> nestedStruct = ValueAdapters.convertValue(uiBasicField.getData(), new TypeReference<List<Map<String, JsonNode>>>() {},objectMapper);

                            if (CollectionUtils.isNotEmpty(nestedStruct)) {
                                log.info("List Data size {} {} ",nestedStruct.size(),nestedStruct);
                                for (Map<String, JsonNode> f : nestedStruct) {
                                    Object temp = ValueAdapters.instantiateClass(clazz,templateName,templateField,field);
                                    Pair<Boolean, Map<String, UiParentField>> derivedData = verifyAndStoreData(f, templateField.getFieldName(), templates, isDraft,
                                            errorInfo, saveDraftOnError, additionalData, fieldMap, temp,allowSkipNewFields,baseObject);
                                    nestedData.add(derivedData.getSecond());
                                    if(!isDraft)
                                        uiBasicField.setErrorOccurred(uiBasicField.isErrorOccurred() || derivedData.getFirst());
                                    if (!derivedData.getFirst() || saveDraftOnError)
                                    {
                                        if(temp instanceof ValueChecker)
                                        {
                                            if(!((ValueChecker)temp).allNull())
                                                objects.add(temp);
                                        }else
                                            objects.add(temp);
                                    }
                                }
                            }
                            if (!errorInfo.isErrorOccurred() || saveDraftOnError)
                            {
                                if(CollectionUtils.isEmpty(objects))
                                    ValueAdapters.setFieldValDirectly(templateName,templateField,field,sourceClass,null);
                                if(Objects.isNull(obj))
                                {
                                    Class secClass = ValueAdapters.loadClass(templateField.getSectionClass(),templateName,templateField,field);
                                    obj = ValueAdapters.instantiateClass(secClass,templateName,templateField,field);
                                }
                                ((TemplateListSection)obj).setData(objects);
                                dataSaved = ValueAdapters.setFieldValDirectly(templateName,templateField,field,sourceClass,obj);
                            }
                            if(CollectionUtils.isNotEmpty(nestedData))
                                uiBasicField.setData(objectMapper.valueToTree(nestedData));
                        }
                        if(needed && !dataSaved)
                        {
                            uiBasicField.setErrorOccurred(true);
                            uiBasicField.setErrorMsg("Section is mandatory or value submitted is not recorded");
                        }
                        if(dataSaved){
                            if(obj instanceof ApprovalProcessor)
                                ((ApprovalProcessor)obj).checkAndUpdateApprovalLevels(templateField,additionalData);
                        }
                    }
                    log.info("UiBaseField {}",uiBasicField);
                    uiFieldMap.put(templateField.getFieldName(), uiBasicField);
                    break;

                default:
                    log.error("No Matching field type found for template field: {} in template {}", templateField, template.getTemplateName());
            }
        }
        ErrorInfo validError = addValidationErrors(templateName,uiFieldMap,baseObject,sourceClass,isDraft,additionalData);
        if(validError.isErrorOccurred())
            updateErrorInfo(errorInfo,validError.getNumErrors());
        log.info("Finished Processing template {}",templateName);
        return Pair.of(currErrors < errorInfo.getNumErrors(),uiFieldMap);
    }

    //Todo: fit the new Adapt field type in below method and alos update the List<Section> with new structure.
    private void verifyEntityData(String templateName, Map<String,Templates> templates, List<String> errors,
                                  Map<String,Field> fields, Object sourceClass, Object baseObject, boolean allowSkipNewFields) throws MalFormedRecordException
    {

        log.info("Processing Template {} {}",templateName,fields);
        Templates template = templates.get(templateName);

        for (TemplateField templateField : template.getFields()) {

            log.info("Processing Field {} {}", templateField.getFieldName(),templateField.isMandatory());
            boolean needed = templateField.isMandatory();
            if(Objects.isNull(fields.get(templateField.getFieldName())))
            {
                log.error("Template field {} not found in Entity Structure, {} skip processing",templateField.getFieldName(),allowSkipNewFields);
                if(allowSkipNewFields)
                    continue;
                else
                    throw new MalFormedRecordException(templateField.getFieldName()+" Field not found");
            }

            FieldType subFieldType = templateField.getFieldSubType();

            Field field = fields.get(templateField.getFieldName());
            Object fieldVal = null;
            try {
                field.setAccessible(true);
                fieldVal = field.get(sourceClass);
            }catch (Exception ex){
                log.error("Error occurred duing field access {} while processing template: {} , template field:{}",field,templateName,templateField);
                throw new StanzaException("Internal Error Occurred");
            }

            if(needed && Objects.isNull(fieldVal))
            {
                log.info("Error : Mandatory is null {}",templateField.getFieldName());
                errors.add((templateField.getFieldType()==FieldType.TEMPLATE ? "Section "+templateField.getFieldName() : templateField.getFieldName())+" is missing or incorrect");
            }
            if(Objects.nonNull(fieldVal) && templateField.getFieldType()!=FieldType.TEMPLATE && Objects.nonNull(templateField.getValidator()))
            {
                //Todo: Add condition for verifying adapt field. use AdaptableProcessor interface to extend this functionality to check any error
                //Also, may be pass additionalData Object, which can help here

                UiField temp = new UiField();
                temp.setFieldName(templateField.getFieldName());
                temp.setDefaultErrorMsgValidation(templateField.getDefaultErrorMsgValidation());
                if(!FieldValidator.validateFieldValueUsingValidator(templateField.getValidator(), templateField.getRegex(), fieldVal,temp))
                    errors.add(templateField.getFieldName()+":"+temp.getErrorMsg());
            }

            if(Objects.nonNull(fieldVal) && templateField.getFieldType()==FieldType.TEMPLATE){
                    log.info("Template Found {} {}", templateField.getFieldName(), templateField.getFieldSubType());

                    if (subFieldType == FieldType.OBJECT) {
                        Class clazz = field.getType();
                        Map<String, Field> fieldMap = Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                        verifyEntityData(templateField.getFieldName(), templates, errors, fieldMap, fieldVal, baseObject, allowSkipNewFields);

                    } else if (subFieldType == FieldType.LIST) {
                        if (Objects.nonNull(fieldVal))
                        {
                            List<Object> objects = ((TemplateListSection) fieldVal).getData();
                            for (Object object : objects) {
                                Map<String, Field> fieldMap = Arrays.stream(object.getClass().getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                                verifyEntityData(templateField.getFieldName(), templates, errors, fieldMap, object, baseObject, allowSkipNewFields);
                            }
                        }
                    }
            }
        }
        ErrorInfo validError = addValidationErrors(templateName,null,baseObject,sourceClass,false,null);
        if(CollectionUtils.isNotEmpty(validError.getErrorList()))
            errors.addAll(validError.getErrorList());
        log.info("Finished Processing template {}",templateName);
    }

    private void updateErrorInfo(ErrorInfo errorInfo){
        errorInfo.setErrorOccurred(true);
        errorInfo.setNumErrors(errorInfo.getNumErrors()+1);
    }

    private void updateErrorInfo(ErrorInfo errorInfo, int numErrors){
        errorInfo.setErrorOccurred(true);
        errorInfo.setNumErrors(errorInfo.getNumErrors()+numErrors);
    }

    private Map<String, UiParentField> getUiFields(String templateName, Map<String,Templates> templates, Map<String,Field> fields, Object sourceClass ,
                                                   Map<String,Object> additionalData, Object baseObject){

        Map<String, UiParentField> uiFieldMap = new LinkedHashMap<>();
        log.info("Processing Template {}",templateName);
        Templates template = templates.get(templateName);

        for (TemplateField templateField : template.getFields()) {
            log.info("Processing field {}", templateField.getFieldName());

            FieldType subFieldType = templateField.getFieldSubType();
            Field field = null;
            Object fieldVal = null;

            if (MapUtils.isNotEmpty(fields) && Objects.nonNull(fields.get(templateField.getFieldName()))) {
                field = fields.get(templateField.getFieldName());
                try {
                    field.setAccessible(true);
                    fieldVal = field.get(sourceClass);
                }catch (Exception ex){
                    log.error("Error occurred duing field access {} while processing template: {} , template field:{}",field,templateName,templateField);
                    throw new StanzaException("Internal Error Occurred");
                }
            }

            switch (templateField.getFieldType()) {
                case TEXT:
                case ENUM:
                case BOOL:
                case DECIMAL:
                case NONDECIMAL:
                case YES_NO:
                case LIST:
                case OBJECT:
                case ADAPT:
                case ADAPT_RO:
                    UiField uiField = getUiFieldTemplate(templateField, fieldVal, additionalData,sourceClass);
                    uiFieldMap.put(templateField.getFieldName(), uiField);
                    break;

                case TEMPLATE:
                    log.info("Template found {} {}", templateField.getFieldName(),templateField.getUiType());
                    UiParentField uiBasicField = getUiBasicField(templateField, templates.get(templateField.getFieldName()),additionalData);

                    if(Objects.nonNull(fieldVal) && fieldVal instanceof ApprovalProcessor)
                        ((ApprovalProcessor)fieldVal).fillApprovalInfo(uiBasicField,templateField,additionalData);

                    if(templates.get(templateField.getFieldName()).getTemplateType() == TemplateType.MODAL)
                        uiBasicField.setSkeleton(objectMapper.valueToTree(getUiFields(templateField.getFieldName(), templates, null, null, additionalData,baseObject)));

                    if (subFieldType == FieldType.OBJECT) {
                        Map<String, Field> fieldMap = null;

                        if (Objects.nonNull(fieldVal))
                            fieldMap = Arrays.stream(fieldVal.getClass().getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                        Map<String, UiParentField> nestedData = getUiFields(templateField.getFieldName(), templates, fieldMap, fieldVal, additionalData,baseObject);

                        uiBasicField.setData(objectMapper.valueToTree(nestedData));

                    } else if (subFieldType == FieldType.LIST) {
                        List<Map<String, UiParentField>> nestedData = new ArrayList<>();
                        if (Objects.nonNull(fieldVal)) {
                            List<Object> objects = ((TemplateListSection)fieldVal).getData();

                            objects.stream().forEach(f -> {
                                Map<String, Field> fieldMap = Arrays.stream(f.getClass().getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
//                                try {
                                nestedData.add(getUiFields(templateField.getFieldName(), templates, fieldMap, f, additionalData,baseObject));
//                                } catch (Exception e) {
//                                    log.info("Error decoding section",e);
//                                    throw new StanzaException("Internal Error Occurred");
//                                }
                            });
                        }
                        if(CollectionUtils.isNotEmpty(nestedData))
                            uiBasicField.setData(objectMapper.valueToTree(nestedData));
                    }
//                    }
                    uiFieldMap.put(templateField.getFieldName(), uiBasicField);
                    break;

                default:
                    log.error("No Matching field type found for template field: {} in template {}", templateField, template.getTemplateName());
            }
        }
        enrichFieldInfo(templateName,uiFieldMap,baseObject,sourceClass,additionalData);
        return uiFieldMap;
    }

    public UiField getUiFieldTemplate(TemplateField templateField, Object fieldVal, Map<String,Object> additionalData, Object source){
        /*
            The re editable functionality needs to be improved when edit shall be locked based on different roles or approval cycles.
         */
        boolean editable = checkIfEditable(templateField,additionalData);

        Object defaultValue = templateField.getDefaultValue();

        UiField uiField = UiField.builder()
                .fieldName(templateField.getFieldName())
                .alias(templateField.getAlias())
                .defaultErrorMsgValidation(templateField.getDefaultErrorMsgValidation())
                .editable(editable)
                .uiFieldType(templateField.getUiType())
                .mandatory(templateField.isMandatory())
                .allowedExtensions(templateField.getAllowedExtensions())
                .isMultiSelect(templateField.getIsMultiSelect())
                .validator(templateField.getValidator())
                .regex(templateField.getRegex())
                .options(templateField.getOptions())
                .build();
        if (editable && Objects.nonNull(templateField.getOptionProvider()) && (templateField.getUiType() == UIFieldType.OPTION_LIST ||
                templateField.getUiType() == UIFieldType.OPTION_LIST_MS || templateField.getUiType() == UIFieldType.OPTION_LIST_ARR))
            uiField.setOptions(this.getListOptions(templateField.getOptionProvider(), additionalData));
        try {
            if (Objects.nonNull(fieldVal))
            {
                if(templateField.getFieldType()== FieldType.YES_NO)
                    uiField.setValue(objectMapper.valueToTree(((Boolean)fieldVal)?new UIKeyValue(YesNoEnum.YES.getOption(),YesNoEnum.YES.name()) :
                            new UIKeyValue(YesNoEnum.NO.getOption(),YesNoEnum.NO.name())));
                else if(templateField.getFieldType()== FieldType.ADAPT)
                {
                    AdaptableProcessor adp = (AdaptableProcessor)source;
                    fieldVal = adp.convertToUIValue(templateField,uiField,fieldVal,additionalData);
                    uiField.setValue(objectMapper.valueToTree(fieldVal));
                }
                else
                    uiField.setValue(objectMapper.valueToTree(fieldVal));
            }
            else if (defaultValue != null)
            {
                JsonNode jsonNode = objectMapper.valueToTree(defaultValue);
                uiField.setValue(jsonNode);
            }
        }catch (Exception e) {
            log.error("Unable to decode stored value using {} {} {} ",fieldVal, defaultValue, templateField.getFieldName(),e);
        }
        return uiField;
    }

    private UiParentField getUiBasicField(TemplateField templateField, Templates template, Map<String,Object> additionalData){
        boolean editable = checkIfEditable(templateField,additionalData);
        return UiParentField.builder()
                .fieldName(templateField.getFieldName())
                .uiPlacement(template.getTemplateType())
                .alias(templateField.getAlias())
                .mandatory(templateField.isMandatory())
                .editable(editable)
                .build();
    }

    private boolean checkIfEditable(TemplateField templateField, Map<String,Object> additionalData){
        boolean editable = templateField.isEditable();
        Integer order = (Integer) additionalData.get(GenericConstants.entityState);
        if(Objects.nonNull(order))
        {
            if(Objects.nonNull(templateField.getEditableOrder()))
                editable = editable && order<=templateField.getEditableOrder();
            else if(order== GenericConstants.editRestrictMax)
                editable=false;
        }
        return editable;
    }

    public void fillOptions(TemplateField templateField, Map<String,Object> additionalData, UiField uiField){
        boolean editable = checkIfEditable(templateField,additionalData);
        if (editable && Objects.nonNull(templateField.getOptionProvider()) && (templateField.getUiType() == UIFieldType.OPTION_LIST ||
                templateField.getUiType() == UIFieldType.OPTION_LIST_MS || templateField.getUiType() == UIFieldType.OPTION_LIST_ARR))
            uiField.setOptions(this.getListOptions(templateField.getOptionProvider(), additionalData));
    }

    public abstract ErrorInfo addValidationErrors(String templateName, Map<String, UiParentField>  data, Object baseObject, Object currentSection,boolean saveDraft, Map<String,Object> additionalData);
//    public abstract ErrorInfo addValidationErrors(String templateName,Map<String,UiParentField>  data, Object baseObject, Object currentSection);
    public abstract void enrichFieldInfo(String templateName,Map<String,UiParentField>  data, Object baseObject, Object currentSection, Map<String,Object> additionalData);

}
