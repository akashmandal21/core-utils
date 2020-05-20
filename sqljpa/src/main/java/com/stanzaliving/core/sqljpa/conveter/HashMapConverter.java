package com.stanzaliving.core.sqljpa.conveter;

import java.io.IOException;
import java.util.Map;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashMapConverter implements AttributeConverter<Map<String, Object>, String> {

	private static ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(Map<String, Object> customerInfo) {

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
	public Map<String, Object> convertToEntityAttribute(String customerInfoJSON) {

		Map<String, Object> customerInfo = null;
		try {
			customerInfo = objectMapper.readValue(customerInfoJSON, Map.class);
		} catch (final IOException e) {
			log.error("JSON reading error", e);
		}

		return customerInfo;
	}

}