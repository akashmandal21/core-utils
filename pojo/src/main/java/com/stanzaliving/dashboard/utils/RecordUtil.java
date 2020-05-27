package com.stanzaliving.dashboard.utils;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.transformation.client.cache.TransformationCache;
import com.stanzaliving.dashboard.dto.RecordDto;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class RecordUtil {

    public static void handleAncillaryFields(List<? extends RecordDto> recordDtoList, AccessLevel accessLevel, TransformationCache transformationCache) {
        if (null == accessLevel || null == transformationCache) {
            throw new StanzaException("Either of accessLevel " + accessLevel + " or transformationCache " + transformationCache + " is null");
        }
        for (RecordDto recordDto : recordDtoList) {
            if (AccessLevel.CITY.equals(accessLevel)) {
                recordDto.setAccessLevelName(transformationCache.getAccessLevelNameByUuid(recordDto.getCityUuid(), accessLevel.toString()));
                recordDto.setMicromarketUuid(null);
                recordDto.setResidenceUuid(null);
            } else if (AccessLevel.MICROMARKET.equals(accessLevel)) {
                recordDto.setAccessLevelName(transformationCache.getAccessLevelNameByUuid(recordDto.getMicromarketUuid(), accessLevel.toString()));
                recordDto.setResidenceUuid(null);
            } else if (AccessLevel.RESIDENCE.equals(accessLevel)) {
                recordDto.setAccessLevelName(transformationCache.getAccessLevelNameByUuid(recordDto.getResidenceUuid(), accessLevel.toString()));
            }
        }
    }

    public static void handleAncillaryFields(List<? extends RecordDto> recordDtoList, String accessLevel, TransformationCache transformationCache) {
        if (StringUtils.isBlank(accessLevel)) {
            throw new StanzaException("AccessLevel cannot be null");
        }
        RecordUtil.handleAncillaryFields(recordDtoList, AccessLevel.valueOf(accessLevel.toUpperCase()), transformationCache);
    }

}