package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.core.enums.DataUnit;
import com.stanzaliving.internet.enums.InternetVendor;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Internet extends BooleanService {
	private String planId;
	private InternetVendor vendor;
	private int devices;
	private Double totalPrice;
	private String planName;
	private int data;
	private DataUnit dataUnit;
	private int speed;
	private DataUnit speedUnit;
	private int validity;
}
