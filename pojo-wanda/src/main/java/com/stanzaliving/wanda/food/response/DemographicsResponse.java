package com.stanzaliving.wanda.food.response;

import java.util.List;

import com.stanzaliving.wanda.DemographicsOverallResponseDto;
import com.stanzaliving.wanda.DemographicsResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DemographicsResponse {

	private List<DemographicsResponseDto> demographicsResponseDtoList;
	private DemographicsOverallResponseDto demographicsOverallResponseDto;

}
