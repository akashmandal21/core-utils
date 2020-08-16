package com.stanzaliving.core.generic.validation.utility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.generic.validation.dtos.*;
import com.stanzaliving.core.generic.validation.enums.FieldType;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@UtilityClass
@Log4j2
public class FieldDecoder {

    public boolean decodeValue(UiField uiSubmitField, TemplateField templateField, boolean needed, ObjectMapper objectMapper, ErrorInfo  errorInfo){

        boolean success = true;
        try {
            FieldType fieldType = templateField.getFieldType();
            JsonNode data = uiSubmitField.getValue();
            log.info("Value data {} field type {} needed {}",data,fieldType,needed);
            Object value = null;

            if (Objects.nonNull(data))
            {
                switch (fieldType) {
                    case TEXT:
                        value = data.asText();
                        break;

                    case ENUM:
                        Class enumClass = Class.forName(templateField.getValueClass());
                        value = Enum.valueOf(enumClass,data.asText());
                        break;

                    case OBJECT:
                        Class clazz = ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null);
                        value = objectMapper.treeToValue(data, clazz);
                        break;

                    case LIST:
                        List<Object> listElements = new ArrayList<>();
                        Iterator<JsonNode> iter = data.iterator();
                        Class valueClass = ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null);
                        while (iter.hasNext()) {
                            listElements.add(objectMapper.treeToValue(iter.next(), valueClass));
                        }
                        if (CollectionUtils.isNotEmpty(listElements))
                            value = listElements;
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
        }
        return success;
    }
}
