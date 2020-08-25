package com.stanzaliving.core.generic.validation.utility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.generic.validation.dtos.*;
import com.stanzaliving.core.generic.validation.enums.FieldType;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@UtilityClass
@Log4j2
public class FieldDecoder {

    public boolean decodeValue(UiField uiSubmitField, TemplateField templateField, boolean needed, ObjectMapper objectMapper,
                               ErrorInfo  errorInfo, Field field, Object source){
        Object value = null;
        boolean success = true;
        try {
            FieldType fieldType = templateField.getFieldType();
            JsonNode data = uiSubmitField.getValue();
            log.info("Value data {} field type {} needed {}",data,fieldType,needed);


            if (Objects.nonNull(data) && (!data.isNull()))
            {
                log.info("Ent");
                switch (fieldType) {
                    case TEXT:
                        value = data.asText();
                        break;

                    case ENUM:
                        Class enumClass = Class.forName(templateField.getValueClass());
                        value = Enum.valueOf(enumClass,data.asText());
                        break;

                    case YES_NO:
                        if(data.asText().equalsIgnoreCase("yes"))
                            value = Boolean.TRUE;
                        else value = Boolean.FALSE;

                    case BOOL:
                        value = data.asBoolean();
                        break;

                    case DECIMAL:
                        value = data.asDouble();
                        break;

                    case NONDECIMAL:
                        value = data.asLong();
                        break;

                    case OBJECT:
                        Class clazz = ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null);
                        value = objectMapper.treeToValue(data, clazz);
                        break;

                    case LIST:
                        value = objectMapper.convertValue(data,ArrayList.class).stream().
                                map(f->objectMapper.convertValue(f, ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null))).collect(Collectors.toList());
//                        List<Object> listElements = new ArrayList<>();
//                        Iterator<JsonNode> iter = data.iterator();
//                        Class valueClass = ValueAdapters.loadClass(templateField.getValueClass(),null,templateField,null);
//
//                        while (iter.hasNext()) {
//                            JsonNode node = iter.next();
//                            log.info("Field Name {} {} {}",templateField.getFieldName(),valueClass.getName(),objectMapper.convertValue(node, valueClass).getClass());
//
//                            listElements.add(ValueAdapters.getValue(node,valueClass,objectMapper));
//                        }
//                        log.info(listElements.stream().map(f->((UIKeyValue)f).getValue()).collect(Collectors.toList()));
//                        if (CollectionUtils.isNotEmpty(listElements))
//                            value = listElements;
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
                        field.set(source,objectMapper.convertValue(value,field.getType()));
                    else
                    {
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
