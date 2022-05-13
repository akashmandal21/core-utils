package com.stanzaliving.core.sqljpa.conveter;

import java.io.IOException;
import java.util.List;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ListGenericsObjectConverter<T> implements AttributeConverter<List<T>, String> {

	private static ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(List<T> attribute) {
		log.info("LIST-OF-GENERIC-OBJECT-CONVERTER::Received attribute for conversion {}", attribute);
		String attributeInfoJson = null;

		try {
			attributeInfoJson = objectMapper.writeValueAsString(attribute);
		} catch (final JsonProcessingException e) {
			log.error("JSON writing error", e);
		}

		return attributeInfoJson;
	}

	@Override
	public List<T> convertToEntityAttribute(String dbData) {
		log.info("LIST-OF-GENERIC-OBJECT-CONVERTER::Convert entity attribute of {}", dbData);
		List<T> attributeInfo = null;
		try {
			attributeInfo = objectMapper.readValue(dbData, new TypeReference<List<T>>() {
			});
		} catch (final IOException e) {
			log.error("JSON reading error", e);
		}

		return attributeInfo;
	}
}
