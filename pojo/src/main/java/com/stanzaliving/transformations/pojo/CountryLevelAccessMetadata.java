package com.stanzaliving.transformations.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryLevelAccessMetadata {

	private Map<Long, StateLevelAccessMetadata> countryLevel;
	
	private Map<Long,CountryUIDto> countryUIDtos;
}
