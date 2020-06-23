package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.GymLocation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gym extends MultiTimeSlotService {
	private GymLocation location;
}
