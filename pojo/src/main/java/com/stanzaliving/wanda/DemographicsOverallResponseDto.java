package com.stanzaliving.wanda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DemographicsOverallResponseDto {

	private Integer totalMir;
	private Map<String, DemographicsPreferenceDto> regionTotalCount;

}
