package com.stanzaliving.dashboard.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.dashboard.constants.ReportConstants;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("rawtypes")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Log4j2
public class RecordDto implements Comparable, Cloneable {

	private String cityUuid;
	private String micromarketUuid;
	private String residenceUuid;
	private String accessLevel;
	private String accessLevelName;

	public RecordDto(RecordDto recordDto) {
		this.cityUuid = recordDto.getCityUuid();
		this.micromarketUuid = recordDto.getMicromarketUuid();
		this.residenceUuid = recordDto.getResidenceUuid();
		this.accessLevel = recordDto.getAccessLevel();
	}

	/**
	 * @return a negative integer, zero, or a positive integer as this object
	 *         is less than, equal to, or greater than the specified object.
	 */
	@Override
	public int compareTo(Object o) {
		RecordDto recordDto = (RecordDto) o;
		if (StringUtils.isNotEmpty(recordDto.getAccessLevel()) && ReportConstants.ALL_CITIES.equals(recordDto.getAccessLevel())) {
			return 1;
		}
		if (StringUtils.isNotEmpty(this.getAccessLevel()) && ReportConstants.ALL_CITIES.equals(this.getAccessLevel())) {
			return -1;
		}

		return this.getAccessLevelName().compareToIgnoreCase(recordDto.getAccessLevelName());
	}

	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			log.error("Getting CloneNotSupportedException ", e);
			throw new RuntimeException(e);
		}
	}

}