
package com.stanzaliving.core.opscalculator.sqljpaconverter;

import java.io.IOException;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.http.BaseMapperConfig;
import com.stanzaliving.core.opscalculator.V2.dto.NucleusRateMasterDto;

import lombok.extern.log4j.Log4j2;

@Converter
@Log4j2

public class NucleusRateMasterDtoConverter implements AttributeConverter<NucleusRateMasterDto, String> {


    private static ObjectMapper objectMapper = null;

        public void init() {
            objectMapper = BaseMapperConfig.getDefaultMapper();
        }


        @Override
        public String convertToDatabaseColumn(NucleusRateMasterDto nucleusRateMasterDto) {

            if (null == nucleusRateMasterDto) {
                return null;
            }

            if (objectMapper == null) {
                this.init();
            }

            try {
                return objectMapper.writeValueAsString(nucleusRateMasterDto);
            } catch (JsonProcessingException e) {
                log.error("Unable to convert nucleusRateMasterDto to json, error {}, nucleusRateMasterDto {}", e.getMessage(), nucleusRateMasterDto, e);
                return null;
            }
        }

        @Override
        public NucleusRateMasterDto convertToEntityAttribute(String nucleusRateMasterDtoJson) {
            if (StringUtils.isBlank(nucleusRateMasterDtoJson)) {
                return null;
            }

            if (objectMapper == null) {
                this.init();
            }

            try {

                return objectMapper.readValue(nucleusRateMasterDtoJson, new TypeReference<NucleusRateMasterDto>() {

                });
            } catch (IOException e) {
                log.error("Unable to convert json to nucleusRateMasterDto , error {}, nucleusRateMasterDto {}", e.getMessage(), nucleusRateMasterDtoJson, e);
                return null;
            }
    }
}