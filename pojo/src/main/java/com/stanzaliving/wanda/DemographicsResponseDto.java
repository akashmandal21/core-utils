package com.stanzaliving.wanda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DemographicsResponseDto {

	private String residenceName;
	private String microMarketName;
	private Integer mirCount;
	private Double latitude;
	private Double longitude;
	private List<DemographicsPreferenceDto> demographicsPreferenceDtoList;
}
