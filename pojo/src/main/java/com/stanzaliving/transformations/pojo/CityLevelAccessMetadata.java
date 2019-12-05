package com.stanzaliving.transformations.pojo;

import java.util.Map;

import com.stanzaliving.transformations.projections.CityNameView;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class CityLevelAccessMetadata {

	private Map<Long, MicroMarketAccessLevelMetadata> cityLevel;
	
	private Map<Long, CityNameView> cityUiDto;
	
}
