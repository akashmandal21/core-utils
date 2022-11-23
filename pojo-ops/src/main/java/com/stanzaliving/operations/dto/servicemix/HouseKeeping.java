package com.stanzaliving.operations.dto.servicemix;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HouseKeeping extends BooleanService {
	private WeeklyService room = new WeeklyService();
	private WeeklyService bathroom = new WeeklyService();
	private WeeklyService commonBathroom = new WeeklyService();
	
	@JsonProperty("common_area")
	private WeeklyService commonArea = new WeeklyService();
	
	@JsonProperty("linen_change")
	private WeeklyService linenChange = new WeeklyService();
}
