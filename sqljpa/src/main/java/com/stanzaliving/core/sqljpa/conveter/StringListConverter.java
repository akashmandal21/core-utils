package com.stanzaliving.core.sqljpa.conveter;

import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.collections.CollectionUtils;

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
        return Arrays.asList(string.split(SPLIT_CHAR));
    }
}
