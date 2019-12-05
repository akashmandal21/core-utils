package com.stanzaliving.transformations.pojo;

import java.util.Map;

import com.stanzaliving.transformations.projections.StateNameView;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class StateLevelAccessMetadata {

	private Map<Long, CityLevelAccessMetadata> stateLevel;
	
	private Map<Long,StateUIDto> stateNameView;
}
