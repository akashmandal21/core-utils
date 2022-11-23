package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    private double onmServiceFee;

    private double licenseFee;
    private double cityBuffer;
    private double bumpUpPrice;
    private double conversionPrice;
	private double withoutEscalationPrice;
	private double escalatedPrice;

}