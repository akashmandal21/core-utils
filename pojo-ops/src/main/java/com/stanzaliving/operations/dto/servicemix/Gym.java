package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.GymLocation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Gym extends MultiTimeSlotService {
	private GymLocation location;
}
