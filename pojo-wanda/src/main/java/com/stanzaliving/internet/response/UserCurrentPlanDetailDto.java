package com.stanzaliving.internet.response;

import com.stanzaliving.core.enums.DataUnit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCurrentPlanDetailDto {

	private Double planData;

	private Double usedData;

	private Double availableData;

	private DataUnit dataUnit;

	private String planExpiryDate;

	private boolean boosterPackActive;

	private Double boosterPackData;
	
	private Double boosterPackDataPriceSum;

}
