package com.stanzaliving.dashboard.utils;

import com.stanzaliving.collector.dto.request.RentDashboardRequestDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.dashboard.dto.BaseRequestDto;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

public class TableUtil {

    public static final String ACCESS_CONTROL_WHERE_CLAUSE = " where status = true and " +
            " residence_uuid in (:residenceUuid) and micromarket_uuid in (:micromarketUuid) and city_uuid in (:cityUuid) ";

    public static void setAccessControlParameter(Query query, List<String> cityUuid, List<String> micromarketUuid, List<String> residenceUuid) {
        List<String> defaultAccessLevelEntityList = Arrays.asList("-1");
        query.setParameter("cityUuid", CollectionUtils.isNotEmpty(cityUuid) ? cityUuid : defaultAccessLevelEntityList);
        query.setParameter("micromarketUuid", CollectionUtils.isNotEmpty(micromarketUuid) ? micromarketUuid : defaultAccessLevelEntityList);
        query.setParameter("residenceUuid", CollectionUtils.isNotEmpty(residenceUuid) ? residenceUuid : defaultAccessLevelEntityList);
    }

    public static void setAccessControlParameter(Query query, BaseRequestDto baseRequestDto) {
        setAccessControlParameter(query, baseRequestDto.getCityUuid(), baseRequestDto.getMicromarketUuid(), baseRequestDto.getResidenceUuid());
    }


    public static String getGroupByClauseOnAccessLevel(AccessLevel accessLevel) {
        if (null == accessLevel || AccessLevel.CITY.equals(accessLevel)) {
            return " group by city_uuid ";
        }
        if (AccessLevel.MICROMARKET.equals(accessLevel)) {
            return " group by micromarket_uuid ";
        }
        if (AccessLevel.RESIDENCE.equals(accessLevel)) {
            return " group by residence_uuid ";
        }
        return " ";
    }

    public static String getGroupByClauseOnAccessLevel(String accessLevel) {
        AccessLevel accessLevelEnum = StringUtils.isBlank(accessLevel) ? null : AccessLevel.valueOf(accessLevel.toUpperCase());
        return TableUtil.getGroupByClauseOnAccessLevel(accessLevelEnum);
    }

    public static String getGroupByClauseOnAccessLevel(BaseRequestDto baseRequestDto) {
        AccessLevel accessLevelEnum = StringUtils.isBlank(baseRequestDto.getAccessLevel()) ? null : AccessLevel.valueOf(baseRequestDto.getAccessLevel().toUpperCase());
        return TableUtil.getGroupByClauseOnAccessLevel(accessLevelEnum);
    }



}
