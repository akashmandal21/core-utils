package com.stanzaliving.operations.dto.servicemix;

import java.util.List;

import com.stanzaliving.operations.enums.PaymentMode;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ElectricityAddonService extends AcquiredBooleanService {
	private PaymentMode payment;
	private List<List<String>> timing;
}
