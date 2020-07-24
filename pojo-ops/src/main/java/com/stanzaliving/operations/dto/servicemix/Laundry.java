package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Laundry extends BooleanService {
	private WashingService washIron = new WashingService();
	private WashingService washFold = new WashingService();
}
