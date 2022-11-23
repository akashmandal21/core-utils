package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentLineItemDetailsResponseDto {

	private String name;
	private String lineItemAmount;
	private String lineItemAmountPaid;

}
