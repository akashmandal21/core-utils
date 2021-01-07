package com.stanzaliving.core.generic.validation.utility;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.generic.validation.dtos.*;
import com.stanzaliving.core.generic.validation.enums.FieldType;
import com.stanzaliving.core.generic.validation.enums.YesNoEnum;
import com.stanzaliving.core.generic.validation.fieldProcessors.AdaptableProcessor;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.*;

@UtilityClass
@Log4j2
public class FieldDecoder {

    public Object decodeAdaptableValue(UiField uiSubmitField, TemplateField templateField, ObjectMapper objectMapper, ErrorInfo errorInfo){
        JsonNode data = uiSubmitField.getValue();
        Object value = null;
        log.info("Adaptable Value data {} ",data);
        try {
            if (Objects.nonNull(data) && (!data.isNull())) {
                final Class valueClazz = ValueAdapters.loadClass(templateField.getValueClass(), null, templateField, null);
                if (templateField.getFieldSubType() == FieldType.LIST) {
                    JavaType jt = objectMapper.getTypeFactory().constructCollectionType(List.class, valueClazz);
                    value = objectMapper.convertValue(data, jt);
                } else  value = objectMapper.treeToValue(data, valueClazz);
            }
        } catch (Exception ex) {
            setErrorMsg("Field "+templateField.getFieldName()+" not in required format",errorInfo,uiSubmitField);
            log.error("Field Decoding failed {} {} ",templateField.getFieldName(),uiSubmitField,ex);
        }
        return value;
    }

    private void setErrorMsg(String errorMsg, ErrorInfo errorInfo, UiField uiField){
        uiField.setErrorMsg(errorMsg);
        uiField.setErrorOccurred(true);
        errorInfo.setErrorOccurred(true);
        errorInfo.setNumErrors(errorInfo.getNumErrors()+1);
    }

    public boolean decodeValue(UiField uiSubmitField, TemplateField templateField, boolean needed, ObjectMapper objectMapper,
                               ErrorInfo  errorInfo, Field field, Object source, Map<String,Object> additionalData){
        Object value = null;
        boolean success = true;
        try {
            FieldType fieldType = templateField.getFieldType();
            JsonNode data = uiSubmitField.getValue();
            log.info("Value data {} field type {} needed {}",data,fieldType,needed);
            if (Objects.nonNull(data) && (!data.isNull()))
            {
                switch (fieldType) {
                    case TEXT:
                        if(data.asText().length()==0)
                            value = null;
                        else
                            value = data.asText();
                        break;

                    case ENUM:
                        Class enumClass = Class.forName(templateField.getValueClass());
                        value = Enum.valueOf(enumClass,data.asText());
                        break;

                    case YES_NO:
                        if(YesNoEnum.valueOf(objectMapper.treeToValue(data, UIKeyValue.class).getValue())==YesNoEnum.YES)
                            value = Boolean.TRUE;
                        else
                            value = Boolean.FALSE;
                        break;
                    case BOOL:
                        value = data.asBoolean();
                        break;

                    case DECIMAL:
                        value = data.asDouble();
                        break;

                    case NONDECIMAL:
                        value = data.asLong();
                        break;

                    case ADAPT:
                        final Class valueClazz = ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null);
                        if(templateField.getFieldSubType()==FieldType.LIST) {
                            JavaType jt = objectMapper.getTypeFactory().constructCollectionType(List.class, valueClazz);
                            value = objectMapper.convertValue(data,jt);
                        }else value = objectMapper.treeToValue(data, valueClazz);
                        break;

                    case OBJECT:
                        Class clazz = ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null);
                        value = objectMapper.treeToValue(data, clazz);
                        break;

                    case LIST:
                        JavaType jt = objectMapper.getTypeFactory().constructCollectionType(List.class,ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null));
                        List<Object> elems = objectMapper.convertValue(data,jt);
                        if(elems.size()>0)
                            value = elems;
                        else
                            value = null;
                        break;

                    default:
                        log.error("No Mapping found for Field Type {}", fieldType);
                        value = null;
                }
            }

            if (needed && Objects.isNull(value))
                uiSubmitField.setErrorMsg("Field is mandatory");

            if (Objects.nonNull(value) && Objects.nonNull(templateField.getValidator()))
                FieldValidator.validateFieldValueUsingValidator(templateField.getValidator(), templateField.getRegex(), value,uiSubmitField);

            if (StringUtils.isNotEmpty(uiSubmitField.getErrorMsg()))
                success = false;

            log.info("Ent {} {}",uiSubmitField.getErrorMsg());
        }catch (Exception ex){
            uiSubmitField.setErrorMsg("Field "+templateField.getFieldName()+" not in required format");
            log.error("Field Decoding failed {} {} ",templateField.getFieldName(),uiSubmitField,ex);
            success=false;
        }

        if(!success)
        {
            uiSubmitField.setErrorOccurred(true);
            errorInfo.setErrorOccurred(true);
            errorInfo.setNumErrors(errorInfo.getNumErrors()+1);
        }else {
                log.info(value);
                try {
                    if(Objects.nonNull(value))
                    {
                        if(templateField.getFieldType()==FieldType.ADAPT)
                        {
                            AdaptableProcessor adp =(AdaptableProcessor)source;
                            adp.convertFromUIValue(templateField,uiSubmitField,value,additionalData,errorInfo);
                        }else
                            field.set(source,objectMapper.convertValue(value,field.getType()));
                    }
                    else
                    {
                        value = null;
                        field.set(source,null);
                    }
                } catch (IllegalAccessException e) {
                    log.error("Unable to set the field value {}",e.getMessage());
                    success = false;
                    uiSubmitField.setErrorMsg("Intenal Error occurred");
                }

        }
        return success;
    }
}
