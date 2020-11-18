package com.stanzaliving.core.opscalculator.sqljpaconverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.http.BaseMapperConfig;
import com.stanzaliving.core.opscalculator.dto.UnderWrittenDto;
import com.stanzaliving.core.opscalculator.dto.response.MonthlyUnderWrittenDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;

@Converter
@Log4j2
public class MonthlyUnderWrittenConverter implements AttributeConverter<MonthlyUnderWrittenDto, String>  {

    private static ObjectMapper objectMapper = null;

    public void init() {
        objectMapper = BaseMapperConfig.getDefaultMapper();
    }


    @Override
    public String convertToDatabaseColumn(MonthlyUnderWrittenDto underWrittenDto) {

        if (null == underWrittenDto) {
            return null;
        }

        if (objectMapper == null) {
            this.init();
        }

        try {
            return objectMapper.writeValueAsString(underWrittenDto);
        } catch (JsonProcessingException e) {
            log.error("Unable to convert annualUnderWrittenDto to json, error {}, monthlyUnderWrittenDto {}", e.getMessage(), underWrittenDto, e);
            return null;
        }
    }

    @Override
    public MonthlyUnderWrittenDto convertToEntityAttribute(String monthlyUnderWrittenDtoJson) {

        if (StringUtils.isBlank(monthlyUnderWrittenDtoJson)) {
            return null;
        }

        if (objectMapper == null) {
            this.init();
        }

        try {
            return objectMapper.readValue(monthlyUnderWrittenDtoJson, new TypeReference<MonthlyUnderWrittenDto>() {
            });
        } catch (IOException e) {
            log.error("Unable to convert json to underWrittenDto , error {}, underWrittenDtoJson {}", e.getMessage(), monthlyUnderWrittenDtoJson, e);
            return null;
        }
    }
}
