package com.stanzaliving.core.sqljpa.conveter;

import java.io.IOException;
import java.util.List;

import javax.persistence.AttributeConverter;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ListObjectConverter implements AttributeConverter<List<Object>, String> {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<Object> attribute) {
        log.info("LIST-HASHMAP-CONVERTER::Received attribute for conversion {}",attribute);
        String attributeInfoJson = null;

        try {
        	if(CollectionUtils.isNotEmpty(attribute)) {
        		attributeInfoJson = objectMapper.writeValueAsString(attribute);	
        	}
        } catch (final JsonProcessingException e) {
            log.error("JSON writing error", e);
        }

        return attributeInfoJson;
    }

    @Override
    public List<Object> convertToEntityAttribute(String dbData) {
        log.info("LIST-HASHMAP-CONVERTER::Convert entity attribute of {}",dbData);
        List<Object> attributeInfo = null;
		try {
			if (StringUtils.isNotBlank(dbData)) {
				attributeInfo = objectMapper.readValue(dbData, new TypeReference<List<Object>>() {
				});
			}
		} catch (final IOException e) {
            log.error("JSON reading error", e);
        }

        return attributeInfo;
    }
}
