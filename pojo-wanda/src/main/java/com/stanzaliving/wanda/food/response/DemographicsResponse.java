package com.stanzaliving.wanda.food.response;

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
public class DemographicsResponse {

	private List<DemographicsResponseDto> demographicsResponseDtoList;
	private DemographicsOverallResponseDto demographicsOverallResponseDto;

}
