package com.stanzaliving.core.opscalculator.sqljpaconverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import com.stanzaliving.core.opscalculatorv2.dto.UnderWrittenV2Dto;

import lombok.extern.log4j.Log4j2;

@Converter
@Log4j2
public class AnnualUnderWrittenDtoV2Converter implements AttributeConverter<UnderWrittenV2Dto, String> {

        @Override
        public String convertToDatabaseColumn(UnderWrittenV2Dto underWrittenDto) {

            if (null == underWrittenDto) {
                return null;
            }

            return ObjectMapperUtil.getString(underWrittenDto);
        }

        @Override
        public UnderWrittenV2Dto convertToEntityAttribute(String annualUnderWrittenDtoJson) {

            if (StringUtils.isBlank(annualUnderWrittenDtoJson)) {
                return null;
            }
            
            return ObjectMapperUtil.getObjectFromString(annualUnderWrittenDtoJson, UnderWrittenV2Dto.class);
    }
}