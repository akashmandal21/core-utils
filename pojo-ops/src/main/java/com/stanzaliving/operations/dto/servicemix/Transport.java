package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.TransportAvailabilityMode;
import com.stanzaliving.operations.enums.TransportSchedule;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transport extends BooleanService {
	private TransportAvailabilityMode availability;
	private TransportSchedule schedule;
	private Double freeKm;
	
}
