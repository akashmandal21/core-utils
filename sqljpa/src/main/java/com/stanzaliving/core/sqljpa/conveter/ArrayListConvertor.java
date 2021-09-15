package com.stanzaliving.core.sqljpa.conveter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ArrayListConvertor implements AttributeConverter<List<Map<String, String>>, String> {

    private static ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public String convertToDatabaseColumn(List<Map<String, String>> customerInfo) {

        String customerInfoJson = null;
        try {
            customerInfoJson = objectMapper.writeValueAsString(customerInfo);
        } catch (final JsonProcessingException e) {
            log.error("JSON writing error", e);
        }

        return customerInfoJson;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Map<String, String>> convertToEntityAttribute(String customerInfoJSON) {
        List<Map<String, String>> customerInfo = null;
        try {
            customerInfo = objectMapper.readValue(customerInfoJSON, List.class);
        } catch (final IOException e) {
            log.error("JSON reading error", e);
        }

        return customerInfo;
    }
}