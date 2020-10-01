package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.venta.response.CityResponseDTO.CityResponseDTOBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePaymentModeResponse {

	private boolean status;
	
	private String message;
	
	private boolean takeToPaymentScreen;
}
