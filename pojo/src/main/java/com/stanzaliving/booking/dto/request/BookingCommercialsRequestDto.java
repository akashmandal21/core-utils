package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCommercialsRequestDto {
	
	private Double licenseFee;
	
	@Builder.Default
	private Double cityheadbuffer = 0.0;
	
	@Builder.Default
	private Double upsell = 0.0;
	
	@Builder.Default
	private Double priceBump = 0.0;
	
	private ServicePriceRequestDto packagedServicePriceDto;
	
	private ServicePriceRequestDto foodServicePriceDto;
	
	private ServicePriceRequestDto vasPriceDto;

}
