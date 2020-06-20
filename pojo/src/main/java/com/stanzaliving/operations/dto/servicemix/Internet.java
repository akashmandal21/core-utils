package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.internet.enums.InternetVendor;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Internet {
	private boolean active;
	private String planId;
	private InternetVendor vendor;
	private int devices;
	private Double totalPrice;
}
