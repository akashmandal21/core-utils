package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Electricity extends BooleanService {
	private ElectricityService room;
	private ElectricityService common_area;
	private MultiTimeSlotService geyser;
	private MultiTimeSlotService commonGeyser;
	private MultiTimeSlotService ac;
	private PowerBackup power_backup;
}
