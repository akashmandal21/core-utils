package com.stanzaliving.transformations.pojo;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CountryLevelAccessMetadata {

	private Map<CountryUIDto, StateLevelAccessMetadata> countryLevel;
	
}
