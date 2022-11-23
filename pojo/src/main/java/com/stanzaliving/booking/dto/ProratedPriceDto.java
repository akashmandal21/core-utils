package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProratedPriceDto {
	
	private Double proratedServicePrice;
	
	private Double proratedRentalPrice;
	
	private Double proratedFoodPrice;;
	
	private Double proratedMaintenancePrice;

}
