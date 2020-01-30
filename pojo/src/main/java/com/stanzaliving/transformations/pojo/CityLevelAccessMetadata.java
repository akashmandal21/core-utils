package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.util.Map;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CityLevelAccessMetadata {

	private Map<Long, MicroMarketAccessLevelMetadata> cityLevel;
	
	private Map<Long, CityUIDto> cityUiDto;
	
}
