
package com.stanzaliving.core.opscalculator.sqljpaconverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import com.stanzaliving.core.opscalculatorv2.dto.NucleusRateMasterData;

import lombok.extern.log4j.Log4j2;

@Converter
@Log4j2
public class NucleusRateMasterDtoConverter implements AttributeConverter<NucleusRateMasterData, String> {

	@Override
    public String convertToDatabaseColumn(NucleusRateMasterData nucleusRateMasterData) {

        if (null == nucleusRateMasterData) {
            return null;
        }

        return ObjectMapperUtil.getString(nucleusRateMasterData);
    }

    @Override
    public NucleusRateMasterData convertToEntityAttribute(String nucleusRateMasterDataJson) {

        if (StringUtils.isBlank(nucleusRateMasterDataJson)) {
            return null;
        }
        
        return ObjectMapperUtil.getObjectFromString(nucleusRateMasterDataJson, NucleusRateMasterData.class);
}
}