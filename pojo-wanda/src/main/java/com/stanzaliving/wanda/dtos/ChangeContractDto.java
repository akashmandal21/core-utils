package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ChangeContractDto {

	private int contractId;
	
	private String contractMonths;
	
	private String amountSavedText;
	
	private boolean currentlySelected;
	
	private String couponCode;
	
	private String couponText;
	
	private String couponDescription;
}
