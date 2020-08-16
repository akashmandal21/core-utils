package com.stanzaliving.core.generic.validation.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.exception.NoRecordException;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.generic.validation.dtos.*;
import com.stanzaliving.core.generic.validation.entity.Templates;
import com.stanzaliving.core.generic.validation.enums.FieldOptionProvider;
import com.stanzaliving.core.generic.validation.enums.FieldType;
import com.stanzaliving.core.generic.validation.enums.UIFieldType;
import com.stanzaliving.core.generic.validation.filter.TemplateFilter;
import com.stanzaliving.core.generic.validation.utility.FieldDecoder;
import com.stanzaliving.core.generic.validation.utility.ValueAdapters;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
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

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ObjectMapper objectMapper;
    

    public Map<String, UiParentField> getBasicUIData(TemplateFilter templateFilter, String templateName,
                                                     Map<String,Object> additionalData, Object sourceClass, Map<String,Field> fieldMap) throws Exception {

        log.info("Request {} {}",sourceClass,fieldMap);
        Query query = templateFilter.getFilterCriterion();
        Map<String, Templates> templates = mongoTemplate.find(query, Templates.class).stream().collect(Collectors.toMap(f->f.getTemplateName(), Function.identity()));
        if(MapUtils.isNotEmpty(templates) && Objects.nonNull(templates.get(templateName))){

            Map<String, UiParentField> fields = getUiFields(templateName,templates,fieldMap,sourceClass,additionalData);
            return fields;
        }else {
            log.error("No Templates configured for the provided filters {}",templateFilter.getFormattedString());
            throw new NoRecordException("No Such Combination exist for provided filters "+templateFilter.getFormattedString());
        }
    }

    public Pair<Boolean,Map<String, UiParentField>> storeSubmittedUIData(TemplateFilter templateFilter, String templateName,
                                                                         Map<String,JsonNode> uiSubmittedDto, boolean isDraft, boolean isSaveOnError,
                                                                         ErrorInfo errorInfo, Map<String,Object> additionalData,
                                                                         Object sourceClass, Map<String,Field> fieldMap, boolean allowSkipOnNewFields){

        Query query = templateFilter.getFilterCriterion();
        Map<String,Templates> templates = mongoTemplate.find(query, Templates.class).stream().collect(Collectors.toMap(f->f.getTemplateName(), Function.identity()));
        if(MapUtils.isNotEmpty(templates) && Objects.nonNull(templates.get(templateName))){
            Pair<Boolean,Map<String, UiParentField>> fields = verifyAndStoreData(uiSubmittedDto,templateName,templates, isDraft,errorInfo,isSaveOnError,
                    additionalData,fieldMap,sourceClass,allowSkipOnNewFields,sourceClass);
            return Pair.of(fields.getFirst(),fields.getSecond());
        }else {
            log.error("No Templates configured for the provided filters {}",templateFilter.getFormattedString());
            throw new NoRecordException("No Such Combination exist for provided filters "+templateFilter.getFormattedString());
        }
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

    private Pair<Boolean,Map<String, UiParentField>> verifyAndStoreData(Map<String,JsonNode>  data, String templateName,
                                                                        Map<String,Templates> templates, boolean isDraft,
                                                                        ErrorInfo errorInfo, boolean saveDraftOnError,
                                                                        Map<String,Object> additionalData,
                                                                        Map<String,Field> fields, Object sourceClass,
                                                                        boolean allowSkipNewFields, Object baseObject){

        log.info("Processing Template {} {}",templateName,fields);
        final int currErrors = errorInfo.getNumErrors();
        Map<String, UiParentField> uiFieldMap = new LinkedHashMap<>();
        Templates template = templates.get(templateName);

        boolean mainDataPresent = MapUtils.isNotEmpty(data);

        for (TemplateField templateField : template.getFields()) {

            log.info("Processing Field {}", templateField.getFieldName());

            if(Objects.isNull(fields.get(templateField.getFieldName())))
            {
                log.error("Template field {} not found in Dto Struture, skip processing",templateField.getFieldName(),fields);
                if(allowSkipNewFields)
                    continue;
                else
                    throw new StanzaException("Internal Error Occurred");
            }
            boolean needed = templateField.isMandatory() && !isDraft;
            boolean dataPresent = mainDataPresent && Objects.nonNull(data.get(templateField.getFieldName()));
            FieldType subFieldType = templateField.getFieldSubType();

            Field field = fields.get(templateField.getFieldName());
            field.setAccessible(true);

            switch (templateField.getFieldType()) {
                case TEXT:
                case LIST:
                case ENUM:
                case OBJECT:

                    UiField uiField = null;

                    if (!dataPresent) {
                        uiField = getUiFieldTemplate(templateField, null, additionalData);
                        if(needed)
                        {
                            uiField.setErrorMsg("Field is mandatory");
                            updateErrorInfo(errorInfo);
                        }
                    } else {
                        uiField = ValueAdapters.getValue(data.get(templateField.getFieldName()), UiField.class,objectMapper);

                        boolean decodeResult = FieldDecoder.decodeValue(uiField, templateField, needed, objectMapper, errorInfo);
                        log.info("Decode status field-name:{} result:{}", templateField.getFieldName(), decodeResult);
                        if (decodeResult && Objects.nonNull(uiField.getValue()))
                            ValueAdapters.setFieldVal(templateName,templateField,field,sourceClass,uiField.getValue(),objectMapper);
                    }
                    uiFieldMap.put(templateField.getFieldName(), uiField);
                    break;

                case TEMPLATE:
                    UiParentField uiBasicField = null;
                    if (!dataPresent)
                    {
                        uiBasicField = getUiBasicField(templateField, templates.get(templateField.getFieldName()));
                        if(needed){
                            uiBasicField.setErrorOccurred(true);
                            updateErrorInfo(errorInfo);
                        }
                    }else {
                        uiBasicField = ValueAdapters.convertValue(data.get(templateField.getFieldName()), new TypeReference<UiParentField>() {},objectMapper);

                        if (subFieldType == FieldType.OBJECT) {
                            Class clazz = field.getType();
                            Object obj = ValueAdapters.instantiateClass(clazz,templateName,templateField,field);
                            Map<String, Field> fieldMap = Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                            Map<String, JsonNode> nestedStruct = ValueAdapters.convertValue(uiBasicField.getData(), new TypeReference<Map<String, JsonNode>>() {},objectMapper);

                            Pair<Boolean, Map<String, UiParentField>> nestedData = verifyAndStoreData(nestedStruct, templateField.getFieldName(),
                                    templates, isDraft, errorInfo, saveDraftOnError, additionalData, fieldMap, obj,allowSkipNewFields,baseObject);

                            uiBasicField.setErrorOccurred(nestedData.getFirst());
                            uiBasicField.setData(objectMapper.valueToTree(nestedData.getSecond()));
                            if (!nestedData.getFirst() || saveDraftOnError)
                                ValueAdapters.setFieldValDirectly(templateName,templateField,field,sourceClass,obj);

                        } else if (subFieldType == FieldType.LIST) {
                            List<Object> objects = new ArrayList<>();
                            Class clazz = ValueAdapters.loadClass(templateField.getValueClass(),templateName,templateField,field);
                            Map<String, Field> fieldMap = Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));

                            List<Map<String, UiParentField>> nestedData = new ArrayList<>();
                            List<Map<String, JsonNode>> nestedStruct = ValueAdapters.convertValue(uiBasicField.getData(), new TypeReference<List<Map<String, JsonNode>>>() {},objectMapper);

                            if (CollectionUtils.isNotEmpty(nestedStruct)) {
                                for (Map<String, JsonNode> f : nestedStruct) {
                                    Object obj = ValueAdapters.instantiateClass(clazz,templateName,templateField,field);
                                    Pair<Boolean, Map<String, UiParentField>> derivedData = verifyAndStoreData(f, templateField.getFieldName(), templates, isDraft,
                                            errorInfo, saveDraftOnError, additionalData, fieldMap, obj,allowSkipNewFields,baseObject);
                                    nestedData.add(derivedData.getSecond());

                                    uiBasicField.setErrorOccurred(uiBasicField.isErrorOccurred() || derivedData.getFirst());
                                    if (!derivedData.getFirst() || saveDraftOnError)
                                        objects.add(obj);
                                }
                            } else
                                nestedData.add(getUiFields(templateField.getFieldName(), templates, null, null, additionalData));
                            if (!errorInfo.isErrorOccurred() || saveDraftOnError)
                                ValueAdapters.setFieldValDirectly(templateName,templateField,field,sourceClass,objects);
                            uiBasicField.setData(objectMapper.valueToTree(nestedData));
                        }
                    }
                    uiFieldMap.put(templateField.getFieldName(), uiBasicField);
                    break;

                default:
                    log.error("No Matching field type found for template field: {} in template {}", templateField, template.getTemplateName());
            }
        }
        ErrorInfo validError = addValidationErrors(templateName,uiFieldMap,baseObject,sourceClass);
        log.info(uiFieldMap);
        if(validError.isErrorOccurred())
            updateErrorInfo(errorInfo,validError.getNumErrors());
        return Pair.of(currErrors == errorInfo.getNumErrors(),uiFieldMap);
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
                                                   Map<String,Object> additionalData){//, boolean readOnly, boolean approveAllowed){

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
                case LIST:
                case OBJECT:
                    UiField uiField = getUiFieldTemplate(templateField, fieldVal, additionalData);
                    uiFieldMap.put(templateField.getFieldName(), uiField);
                    break;

                case TEMPLATE:
                    log.info("Template found {}", templateField.getFieldName());
                    UiParentField uiBasicField = getUiBasicField(templateField, templates.get(templateField.getFieldName()));

//                    if (templateField.getUiType() != UIFieldType.MODAL || Objects.nonNull(field)) {

                        if (subFieldType == FieldType.OBJECT) {
                            Map<String, Field> fieldMap = null;

                            if (Objects.nonNull(fieldVal))
                                fieldMap = Arrays.stream(fieldVal.getClass().getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                            Map<String, UiParentField> nestedData = getUiFields(templateField.getFieldName(), templates, fieldMap, fieldVal, additionalData);

                            uiBasicField.setData(objectMapper.valueToTree(nestedData));

                        } else if (subFieldType == FieldType.LIST) {
                            List<Map<String, UiParentField>> nestedData = new ArrayList<>();
                            if (Objects.nonNull(fieldVal)) {
                                ((List<Object>) fieldVal).stream().forEach(f -> {
                                    Map<String, Field> fieldMap = Arrays.stream(f.getClass().getDeclaredFields()).collect(Collectors.toMap(Field::getName, Function.identity()));
                                    try {
                                        nestedData.add(getUiFields(templateField.getFieldName(), templates, fieldMap, f, additionalData));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                });
                            } else
                                nestedData.add(getUiFields(templateField.getFieldName(), templates, null, null, additionalData));

                            uiBasicField.setData(objectMapper.valueToTree(nestedData));
                        }
//                    }
                    uiFieldMap.put(templateField.getFieldName(), uiBasicField);
                    break;

                default:
                    log.error("No Matching field type found for template field: {} in template {}", templateField, template.getTemplateName());
            }
        }

        return uiFieldMap;
    }

    private UiField getUiFieldTemplate(TemplateField templateField, Object fieldVal, Map<String,Object> additionalData){

        JsonNode defaultValue = templateField.getDefaultValue();

        UiField uiField = UiField.builder()
                .fieldName(templateField.getFieldName())
                .alias(templateField.getAlias())
                .defaultErrorMsgValidation(templateField.getDefaultErrorMsgValidation())
                .editable(templateField.isEditable())
                .mandatory(templateField.isMandatory())
                .allowedExtensions(templateField.getAllowedExtensions())
                .isMultiSelect(templateField.getIsMultiSelect())
                .validator(templateField.getValidator())
                .regex(templateField.getRegex())
                .build();
        if (templateField.getUiType() == UIFieldType.OPTION_LIST)
            uiField.setOptions(this.getListOptions(templateField.getOptionProvider(), additionalData));
        try {
            if (Objects.nonNull(fieldVal))
                uiField.setValue(objectMapper.valueToTree(fieldVal));
            else if (defaultValue != null)
                uiField.setValue(defaultValue);
        }catch (Exception e) {
            log.error("Unable to decode stored value using {} {} {} ",fieldVal, defaultValue, templateField.getFieldName(),e);
        }
        return uiField;
    }

    private UiParentField getUiBasicField(TemplateField templateField, Templates template){
        return UiParentField.builder()
                .fieldName(templateField.getFieldName())
                .uiPlacement(template.getTemplateType())
                .alias(templateField.getAlias())
                .mandatory(templateField.isMandatory())
                .build();
    }

    public abstract ErrorInfo addValidationErrors(String templateName,Map<String,UiParentField>  data, Object baseObject, Object currentSection);

}
