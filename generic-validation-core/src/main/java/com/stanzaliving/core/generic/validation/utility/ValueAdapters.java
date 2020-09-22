package com.stanzaliving.core.generic.validation.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.generic.validation.dtos.TemplateField;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.util.Objects;

@UtilityClass
@Log4j2
public class ValueAdapters {


    public Object getFieldVal(Field field, Object sourceClass){
        try {
            Object obj = field.get(sourceClass);
            return obj;
        } catch (IllegalAccessException e) {
            log.info("Exception occurred while getting the value of the Field Object",e);
            throw new StanzaException("Internal Error Occurred");
        }
    }

    public <T>T getValue(JsonNode value, Class<T> clazz, ObjectMapper objectMapper){
        try {
            return objectMapper.treeToValue(value,clazz);
        } catch (JsonProcessingException e) {
            log.error("Error decoding recieved json {}",value);
            throw new StanzaException("Data not in required format, Internal error occurred");
        }
    }

    public <T>T convertValue(Object value, TypeReference<T> toValueTypeRef, ObjectMapper objectMapper){
        try {
            return objectMapper.convertValue(value, toValueTypeRef);
        } catch (Exception e) {
            log.error("Error decoding recieved json {}",value);
            throw new StanzaException("Data not in required format, Internal error occurred");
        }
    }

    public Class loadClass(String className, String templateName, TemplateField templateField, Field field){
        try {
            return Class.forName(className);
        }catch (Exception e){
            log.error("Error loading class class: {} field: {}, template {} template field {}", className,field, templateName,templateField,e);
            throw new StanzaException("Internal Error Occurred");
        }
    }
    public <T>T instantiateClass(Class<T> clazz,String templateName, TemplateField templateField, Field field){
        try {
            return clazz.newInstance();
        }catch (Exception e) {
            log.error("Error instantiating field class. check no args constructor is there. class: {} field: {}, template {} template field {}",
                    clazz, field, templateName, templateField, e);
            throw new StanzaException("Internal Error Occurred");
        }
    }

    public void setFieldVal(String templateName, TemplateField templateField, Field field,Object source,
                             JsonNode value, ObjectMapper objectMapper){
        try {
            log.info("Field Name {} {}",templateField.getFieldName(),field.getType());
            Object setVal = objectMapper.treeToValue(value,field.getType());
            if(Objects.nonNull(setVal))
                field.set(source, setVal);
            else
                log.error("Error saving data to field. Json Tree to Value Error. Field: {} Value: {}, template {} template field {} ",field,value, templateName,templateField);
        }catch (Exception ex){
            log.error("Error saving data to field {}, template {} template field {}",field, templateName,templateField, ex);
        }
    }

    public void setFieldValDirectly(String templateName, TemplateField templateField, Field field,Object source, Object value){
        try {
            field.set(source, value);
        }catch (Exception ex){
            log.error("Error saving data to field {}, template {} template field {}",field, templateName,templateField, ex);
        }
    }

}
