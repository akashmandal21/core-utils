package com.stanzaliving.internet.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.DataUnit;
import com.stanzaliving.internet.enums.InternetVendor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetPlanDto extends AbstractDto {

	private InternetVendor vendor;
	
	private String planName;
	
	private int data;
	
	private DataUnit dataUnit;

	private int speed;
	
	private DataUnit speedUnit;

	private int validity;
	
	private Double basePrice;

	private Double tax;

	private Double totalPrice;
	
}