package com.stanzaliving.operations.dto.servicemix;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Electricity extends BooleanService {
	private ElectricityService room = new ElectricityService();
	
	@JsonProperty("common_area")
	private ElectricityService commonArea = new ElectricityService();
	private ElectricityAddonService geyser = new ElectricityAddonService();
	private ElectricityAddonService commonGeyser = new ElectricityAddonService();
	private ElectricityAddonService ac = new ElectricityAddonService();
	
	@JsonProperty("power_backup")
	private PowerBackup powerBackup = new PowerBackup();
}
