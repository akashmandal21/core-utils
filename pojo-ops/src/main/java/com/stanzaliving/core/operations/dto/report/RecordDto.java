package com.stanzaliving.core.operations.dto.report;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RecordDto {

	private String cityUuid;
	private String cityName;
	private String micromarketUuid;
	private String micromarketName;
	private String residenceUuid;
	private String residenceName;
	private String accessLevel;

	private int daysConsidered;

	public RecordDto(RecordDto recordDto) {
		this.cityUuid = recordDto.getCityUuid();
		this.micromarketUuid = recordDto.getMicromarketUuid();
		this.residenceUuid = recordDto.getResidenceUuid();
		this.accessLevel = recordDto.getAccessLevel();
		this.daysConsidered = recordDto.getDaysConsidered();
	}
}