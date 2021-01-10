package com.stanzaliving.core.sqljpa.conveter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {
    private static final String SPLIT_CHAR = "\\|";

    @Override
    public String convertToDatabaseColumn(List<String> stringList) {
    	
    	if(CollectionUtils.isEmpty(stringList)) {
    		return null;
    	}
    	
        return String.join(SPLIT_CHAR, stringList);
    }

    @Override
    public List<String> convertToEntityAttribute(String string) {
    	
    	if(StringUtils.isEmpty(string)) {
    		return Collections.emptyList();
    	}

        List<String> response = new ArrayList<>();

        Stream.of(string.split(SPLIT_CHAR)).forEach(s -> response.add(s.replace("\\", "")));

        return response;
    }
}
