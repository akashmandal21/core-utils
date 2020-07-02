package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.PaymentMode;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ElectricityService extends BooleanService {
	private PaymentMode payment;
	private double rate;
}
