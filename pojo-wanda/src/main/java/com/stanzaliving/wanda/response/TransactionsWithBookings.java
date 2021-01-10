package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.TransactionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TransactionsWithBookings {

	private BookingChargesDto bookingChargesDto;
	
	private String totalAmountPaidStr;
	
	private Double totalAmountPaid;
	
	private List<TransactionDto> transactions;
	
	private String currentOutstandingStr;
	
	private Double currentOutstanding;
	
}