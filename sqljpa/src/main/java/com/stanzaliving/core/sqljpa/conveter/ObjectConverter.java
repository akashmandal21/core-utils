package com.stanzaliving.core.sqljpa.conveter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;

import javax.persistence.AttributeConverter;
import java.io.IOException;


@Log4j2
public class ObjectConverter implements AttributeConverter<Object, String> {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Object attribute) {
//        log.info("OBJECT-CONVERTER::Received attribute for conversion {}",attribute);
        String attributeInfoJson = null;

        try {
            attributeInfoJson = objectMapper.writeValueAsString(attribute);
        } catch (final JsonProcessingException e) {
            log.error("JSON writing error", e);
        }

        return attributeInfoJson;
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
//        log.info("OBJECT-CONVERTER::Convert entity attribute of {}",dbData);
        Object attributeInfo = null;
        try {
            if( dbData != null ) attributeInfo = objectMapper.readValue(dbData, Object.class);
        } catch (final IOException e) {
            log.error("JSON reading error", e);
        }

        return attributeInfo;
    }
}
