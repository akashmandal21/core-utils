package com.stanzaliving.core.residenceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryPricingResponseDto {

	private double packagedServiceFee;
	private double packagedServiceCGST;
	private double packagedServiceIGST;
	private double packagedServiceSGST;

	private double foodServiceFee;
	private double foodServiceCSGT;
	private double foodServiceISGT;
	private double foodServiceSSGT;

	private double vasServiceFee;
	private double vasServiceCSGT;
	private double vasServiceISGT;
	private double vasServiceSSGT;
	
	private Double licenseFee;
	private Double cityBufferPrice;
}
