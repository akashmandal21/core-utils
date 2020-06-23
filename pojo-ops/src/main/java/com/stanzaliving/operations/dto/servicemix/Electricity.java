package com.stanzaliving.operations.dto.servicemix;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Electricity extends BooleanService {
	private ElectricityService room;
	
	@JsonProperty("common_area")
	private ElectricityService commonArea;
	private MultiTimeSlotService geyser;
	private MultiTimeSlotService commonGeyser;
	private MultiTimeSlotService ac;
	
	@JsonProperty("power_backup")
	private PowerBackup powerBackup;
}
