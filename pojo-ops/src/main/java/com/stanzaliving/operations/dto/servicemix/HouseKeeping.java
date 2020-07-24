package com.stanzaliving.operations.dto.servicemix;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HouseKeeping extends BooleanService {
	private WeeklyService room;
	private WeeklyService bathroom;
	private WeeklyService commonBathroom;
	
	@JsonProperty("common_area")
	private WeeklyService commonArea;
	
	@JsonProperty("linen_change")
	private WeeklyService linenChange;
}
