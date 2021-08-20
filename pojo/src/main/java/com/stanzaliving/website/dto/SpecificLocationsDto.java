package com.stanzaliving.website.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecificLocationsDto {

	private List<Integer> cities;
	
	private List<Integer> micromarkets;
	
	private List<Integer> residences;
}
