package com.stanzaliving.transformations.pojo;

import java.util.List;
import java.util.Map;

import com.stanzaliving.transformations.projections.CityNameView;
import com.stanzaliving.transformations.projections.StateNameView;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CountryLevelAccessMetadata {

	private Map<StateNameView, List<CityNameView>> countryLevel;
	
}
