package com.stanzaliving.wanda.venta.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentDetailsResponseDto {

	private String installmentNo;
	private String fromDate;
	private String toDate;
	private String invoiceAmount;
	private String amountPaid;
	private String dueDate;
	private List<InstallmentLineItemDetailsResponseDto> installmentLineItemResponseDtoList;

}
