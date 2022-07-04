
package com.stanzaliving.core.opscalculator.sqljpaconverter;

import java.io.IOException;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.http.BaseMapperConfig;
import com.stanzaliving.core.opscalculator.V2.dto.NucleusRateMasterData;

import lombok.extern.log4j.Log4j2;

@Converter
@Log4j2
public class NucleusRateMasterDtoConverter implements AttributeConverter<NucleusRateMasterData, String> {

    private static ObjectMapper objectMapper = null;

        public void init() {
            objectMapper = BaseMapperConfig.getDefaultMapper();
        }


        @Override
        public String convertToDatabaseColumn(NucleusRateMasterData nucleusRateMasterData) {

            if (null == nucleusRateMasterData) {
                return null;
            }

            if (objectMapper == null) {
                this.init();
            }

            try {
                return objectMapper.writeValueAsString(nucleusRateMasterData);
            } catch (JsonProcessingException e) {
                log.error("Unable to convert nucleusRateMasterData to json, error {}, nucleusRateMasterData {}", e.getMessage(), nucleusRateMasterData, e);
                return null;
            }
        }

        @Override
        public NucleusRateMasterData convertToEntityAttribute(String nucleusRateMasterData) {

            if (StringUtils.isBlank(nucleusRateMasterData)) {
                return null;
            }

            if (objectMapper == null) {
                this.init();
            }

            try {

                return objectMapper.readValue(nucleusRateMasterData, new TypeReference<NucleusRateMasterData>() {

                });
            } catch (IOException e) {
                log.error("Unable to convert json to nucleusRateMasterData , error {}, nucleusRateMasterData {}", e.getMessage(), nucleusRateMasterData, e);
                return null;
            }
    }
}