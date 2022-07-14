package com.stanzaliving.core.sqljpa.conveter;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeConverter;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class IntegerListJsonConverter implements AttributeConverter<List<Integer>, String> {

	private static ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(List<Integer> attribute) {

		if (CollectionUtils.isEmpty(attribute)) {
			return null;
		}
		
		attribute.removeIf(Objects::isNull);

		if (CollectionUtils.isEmpty(attribute)) {
			return null;
		}
		
		String attributeInfoJson = null;

		try {
			attributeInfoJson = objectMapper.writeValueAsString(attribute);
		} catch (final JsonProcessingException e) {
			log.error("JSON writing error", e);
		}

		return attributeInfoJson;
	}

	@Override
	public List<Integer> convertToEntityAttribute(String dbData) {

		if (StringUtils.isBlank(dbData)) {
			return null;
		}

		List<Integer> attributeInfo = null;
		try {
			attributeInfo = objectMapper.readValue(dbData, new TypeReference<List<Integer>>() {
			});
		} catch (final IOException e) {
			log.error("JSON reading error", e);
		}

		return attributeInfo;
	}
}
