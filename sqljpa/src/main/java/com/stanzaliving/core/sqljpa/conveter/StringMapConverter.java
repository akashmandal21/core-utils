package com.stanzaliving.core.sqljpa.conveter;

import java.io.IOException;
import java.util.Map;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Converter
@Log4j2
public class StringMapConverter implements AttributeConverter<Map<String, String>, String> {

    @Autowired
    private ObjectMapper objectMapper;
    
    @Override
    public String convertToDatabaseColumn(Map<String, String> map) {
    	
    	if(MapUtils.isEmpty(map)) {
    		return null;
    	}
    	
        try {
			return objectMapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			log.error("Got error while mapping the column to string");
			return null;
			
			
		}
    }

    @Override
    public Map<String,String> convertToEntityAttribute(String string) {
    	
    	if(StringUtils.isEmpty(string)) {
    		return MapUtils.EMPTY_MAP;
    	}
    	
        try {
			return objectMapper.readValue(string, new TypeReference<Map<String,String>>() {});
		} catch (IOException e) {
			log.error("Got error while mapping the column to map");
			return null;
		}
    }
}
