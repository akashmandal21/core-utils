package com.stanzaliving.core.opscalculator.sqljpaconverter;

import java.io.IOException;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.http.BaseMapperConfig;
import com.stanzaliving.core.opscalculator.V2.dto.UnderWrittenV2Dto;
import com.stanzaliving.core.opscalculator.dto.UnderWrittenDto;

import lombok.extern.log4j.Log4j2;

@Converter
@Log4j2
public class AnnualUnderWrittenDtoV2Converter implements AttributeConverter<UnderWrittenV2Dto, String> {


    private static ObjectMapper objectMapper = null;

        public void init() {
            objectMapper = BaseMapperConfig.getDefaultMapper();
        }


        @Override
        public String convertToDatabaseColumn(UnderWrittenV2Dto underWrittenDto) {

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
        public UnderWrittenV2Dto convertToEntityAttribute(String annualUnderWrittenDtoJson) {

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