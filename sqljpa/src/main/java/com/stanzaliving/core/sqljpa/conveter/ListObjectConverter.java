package com.stanzaliving.core.sqljpa.conveter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.persistence.AttributeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Log4j2
public class ListObjectConverter implements AttributeConverter<List<Object>, String> {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<Object> attribute) {
        log.info("LIST-HASHMAP-CONVERTER::Received attribute for conversion {}",attribute);
        String attributeInfoJson = null;

        try {
            attributeInfoJson = objectMapper.writeValueAsString(attribute);
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
			if (dbData != null) {
				attributeInfo = objectMapper.readValue(dbData, new TypeReference<List<Object>>() {
				});
			}
		} catch (final IOException e) {
            log.error("JSON reading error", e);
        }

        return attributeInfo;
    }
}
