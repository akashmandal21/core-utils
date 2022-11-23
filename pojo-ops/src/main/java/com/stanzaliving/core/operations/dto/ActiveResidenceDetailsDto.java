package com.stanzaliving.core.operations.dto;

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
public class ActiveResidenceDetailsDto {

	private String residenceUuid;
	private String cityId;
	private String cityName;
	private String microMarketId;
	private String microMarketName;
	private String residenceName;
	private Long siteId;

}
