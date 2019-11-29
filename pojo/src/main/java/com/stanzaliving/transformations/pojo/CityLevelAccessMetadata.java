package com.stanzaliving.transformations.pojo;

import java.util.List;
import java.util.Map;

import com.stanzaliving.transformations.projections.CityNameView;
import com.stanzaliving.transformations.projections.MicroMarketNameView;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CityLevelAccessMetadata {

	private Map<CityNameView, List<MicroMarketNameView>> cityLevel;
	
}
