package com.stanzaliving.core.estate.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BuildingBoundaries {
	
	private String buildingBoundaryLeftSide;
	private String buildingBoundaryRightSide;
	private String buildingBoundaryTopSide;
}
