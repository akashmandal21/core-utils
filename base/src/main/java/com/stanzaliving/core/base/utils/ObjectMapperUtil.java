/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.http.BaseMapperConfig;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

/**
 * @author naveen.kumar
 *
 * @date 19 Aug, 2020
 *
 **/
@Log4j2
@UtilityClass
public class ObjectMapperUtil {

	private ObjectMapper mapper;

	static {
		mapper = BaseMapperConfig.getDefaultMapper();
	}

	public String getString(Object object) {
		String json = null;

		try {
			json = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			log.error("Error while parsing object to json: {}", e.getMessage());
		}

		return json;
	}

	public <T> T getObjectFromString(String value, Class<T> clazz) {
		T t = null;
		if (StringUtils.isNotBlank(value)) {
			try {
				t = mapper.readValue(value, clazz);
			} catch (IOException e) {
				log.error("Error while parsing json to object: {}", e.getMessage());
			}
		}
		return t;
	}
	
	public <T> T getObjectFromStringByTypeReference(String value, TypeReference<T> typeReference) {
		T t = null;
		if (StringUtils.isNotBlank(value)) {
			try {
				t = mapper.readValue(value, typeReference);
			} catch (IOException e) {
				log.error("Error while parsing json to object: {}", e.getMessage());
			}
		}
		return t;
	}
}