package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.PaymentMode;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ElectricityService extends BooleanService {
	private PaymentMode payment;
	private double rate;
}
