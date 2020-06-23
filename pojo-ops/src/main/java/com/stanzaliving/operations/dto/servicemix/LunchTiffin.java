package com.stanzaliving.operations.dto.servicemix;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LunchTiffin extends BooleanService {
	private int days;
	
	private List<String> pickupTime;
	private List<String> deliveryTime;
	
}
