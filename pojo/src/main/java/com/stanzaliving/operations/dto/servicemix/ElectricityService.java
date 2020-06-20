package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ElectricityService extends BooleanService {
	private String payment;
	private double rate;
}
