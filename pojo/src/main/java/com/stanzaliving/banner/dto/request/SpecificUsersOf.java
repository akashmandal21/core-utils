package com.stanzaliving.banner.dto.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecificUsersOf {

	private List<String> cities;
	
	private List<String> micromarkets;
	
	private List<String> residences;
}
