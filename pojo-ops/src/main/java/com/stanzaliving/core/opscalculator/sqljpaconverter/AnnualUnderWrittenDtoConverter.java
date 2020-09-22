package com.stanzaliving.core.opscalculator.sqljpaconverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdDeserializer;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeDeserializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeSerializer;
import com.stanzaliving.core.opscalculator.dto.AnnualUnderWrittenDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.PostConstruct;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@Converter
@Log4j2
public class AnnualUnderWrittenDtoConverter implements AttributeConverter<AnnualUnderWrittenDto, String> {


    private static ObjectMapper objectMapper = null;

    public void init() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);

        SimpleModule module = new SimpleModule();
        module.addSerializer(new Java8LocalDateStdSerializer());
        module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());

        module.addSerializer(new Java8LocalTimeSerializer());
        module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

        objectMapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(module);
    }


    @Override
    public String convertToDatabaseColumn(AnnualUnderWrittenDto annualUnderWrittenDto) {

        if (null == annualUnderWrittenDto) {
            return null;
        }

        if (objectMapper == null) {
            this.init();
        }

        try {
            return objectMapper.writeValueAsString(annualUnderWrittenDto);
        } catch (JsonProcessingException e) {
            log.error("Unable to convert annualUnderWrittenDto to json, error {}, annualUnderWrittenDto {}", e.getMessage(), annualUnderWrittenDto, e);
            return null;
        }
    }

    @Override
    public AnnualUnderWrittenDto convertToEntityAttribute(String annualUnderWrittenDtoJson) {

        if (StringUtils.isBlank(annualUnderWrittenDtoJson)) {
            return null;
        }

        try {
            return objectMapper.readValue(annualUnderWrittenDtoJson, new TypeReference<AnnualUnderWrittenDto>() {
            });
        } catch (IOException e) {
            log.error("Unable to convert json to underWrittenDto , error {}, underWrittenDtoJson {}", e.getMessage(), annualUnderWrittenDtoJson, e);
            return null;
        }
    }
}