package com.stanzaliving.core.opscalculator.sqljpaconverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.http.BaseMapperConfig;
import com.stanzaliving.core.opscalculator.dto.UnderWrittenDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;

@Converter
@Log4j2
public class AnnualUnderWrittenDtoConverter implements AttributeConverter<UnderWrittenDto, String> {


    private static ObjectMapper objectMapper = null;

        public void init() {
            objectMapper = BaseMapperConfig.getDefaultMapper();
        }


        @Override
        public String convertToDatabaseColumn(UnderWrittenDto underWrittenDto) {

            if (null == underWrittenDto) {
                return null;
            }

            if (objectMapper == null) {
                this.init();
            }

            try {
                return objectMapper.writeValueAsString(underWrittenDto);
            } catch (JsonProcessingException e) {
                log.error("Unable to convert annualUnderWrittenDto to json, error {}, annualUnderWrittenDto {}", e.getMessage(), underWrittenDto, e);
                return null;
            }
        }

        @Override
        public UnderWrittenDto convertToEntityAttribute(String annualUnderWrittenDtoJson) {

            if (StringUtils.isBlank(annualUnderWrittenDtoJson)) {
                return null;
            }

            if (objectMapper == null) {
                this.init();
            }

            try {
                return objectMapper.readValue(annualUnderWrittenDtoJson, new TypeReference<UnderWrittenDto>() {
                });
            } catch (IOException e) {
                log.error("Unable to convert json to underWrittenDto , error {}, underWrittenDtoJson {}", e.getMessage(), annualUnderWrittenDtoJson, e);
                return null;
            }
    }
}