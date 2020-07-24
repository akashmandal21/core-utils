package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LunchTiffin extends BooleanService {
	private int days;
	
	private String pickupStartTime;
	private String pickupEndTime;
	
	private String deliveryStartTime;
	private String deliveryEndTime;

}
