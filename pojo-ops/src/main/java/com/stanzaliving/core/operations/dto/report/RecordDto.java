package com.stanzaliving.core.operations.dto.report;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.constants.FoodReportConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuppressWarnings("rawtypes")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RecordDto implements Comparable {

	private String cityUuid;
	private String cityName;
	private String micromarketUuid;
	private String micromarketName;
	private String residenceUuid;
	private String residenceName;
	private String accessLevel;

	private Integer daysConsidered;

	public RecordDto(RecordDto recordDto) {
		this.cityUuid = recordDto.getCityUuid();
		this.micromarketUuid = recordDto.getMicromarketUuid();
		this.residenceUuid = recordDto.getResidenceUuid();
		this.accessLevel = recordDto.getAccessLevel();
		this.daysConsidered = recordDto.getDaysConsidered();
	}

	/**
	 * @return a negative integer, zero, or a positive integer as this object
	 *         is less than, equal to, or greater than the specified object.
	 */
	@Override
	public int compareTo(Object o) {
		RecordDto recordDto = (RecordDto) o;
		if (StringUtils.isNotEmpty(recordDto.getAccessLevel()) && FoodReportConstants.ALL_CITIES.equals(recordDto.getAccessLevel())) {
			return 1;
		}
		if (StringUtils.isNotEmpty(this.getAccessLevel()) && FoodReportConstants.ALL_CITIES.equals(this.getAccessLevel())) {
			return -1;
		}

		if (StringUtils.isNotEmpty(this.getAccessLevel()) && StringUtils.isNotEmpty(recordDto.getAccessLevel())) {
			AccessLevel level = AccessLevel.valueOf(accessLevel);
			switch (level) {
				case CITY:
					return this.getCityName().compareToIgnoreCase(recordDto.getCityName());
				case MICROMARKET:
					return this.getMicromarketName().compareToIgnoreCase(recordDto.getMicromarketName());
				case RESIDENCE:
					return this.getResidenceName().compareToIgnoreCase(recordDto.getResidenceName());
				default:
					break;
			}
		}
		return 0;
	}

}