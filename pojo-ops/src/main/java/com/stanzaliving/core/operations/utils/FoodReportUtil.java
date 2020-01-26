/**
 * 
 */
package com.stanzaliving.core.operations.utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;

import lombok.experimental.UtilityClass;

/**
 * @author naveen.kumar
 *
 * @date 26-Jan-2020
 *
 **/
@UtilityClass
public class FoodReportUtil {

	public String getEntityForAccessLevel(AccessLevel accessLevel, RecordDto recordDto) {

		String entityUuid = null;

		if (AccessLevel.CITY == accessLevel) {
			entityUuid = recordDto.getCityUuid();
		} else if (AccessLevel.MICROMARKET == accessLevel) {
			entityUuid = recordDto.getMicromarketUuid();
		} else if (AccessLevel.RESIDENCE == accessLevel) {
			entityUuid = recordDto.getResidenceUuid();
		}

		return entityUuid;
	}

	public Integer getMIRCount(AccessLevel accessLevel, RecordDto recordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap) {

		Integer mir = 0;

		DateLevelNumbersDto dateLevelNumbersDto = dateLevelFieldsMap.get(FoodReportUtil.getEntityForAccessLevel(accessLevel, recordDto));

		if (Objects.nonNull(dateLevelNumbersDto)) {
			mir = dateLevelNumbersDto.getMovedInResidents();
		} else {

			for (Entry<String, DateLevelNumbersDto> entry : dateLevelFieldsMap.entrySet()) {
				mir += entry.getValue().getMovedInResidents();
			}

		}

		return mir;
	}

	public Integer getOccupiedBedCount(AccessLevel accessLevel, RecordDto recordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap) {

		Integer occupied = 0;

		DateLevelNumbersDto dateLevelNumbersDto = dateLevelFieldsMap.get(FoodReportUtil.getEntityForAccessLevel(accessLevel, recordDto));

		if (Objects.nonNull(dateLevelNumbersDto)) {
			occupied = dateLevelNumbersDto.getOccupiedBeds();
		} else {

			for (Entry<String, DateLevelNumbersDto> entry : dateLevelFieldsMap.entrySet()) {
				occupied += entry.getValue().getOccupiedBeds();
			}

		}

		return occupied;
	}
}