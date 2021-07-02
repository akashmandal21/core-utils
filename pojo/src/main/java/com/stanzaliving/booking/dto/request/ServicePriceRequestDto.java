package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicePriceRequestDto {
	
	@Builder.Default
	private Double serviceFee = 0.0;
	
	@Builder.Default
	private Double cgst = 0.0;
	
	@Builder.Default
	private Double sgst = 0.0;
	
	@Builder.Default
	private Double igst = 0.0;

}
