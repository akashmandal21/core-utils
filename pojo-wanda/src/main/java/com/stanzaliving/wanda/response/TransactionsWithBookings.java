package com.stanzaliving.wanda.response;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

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
	
	private String totalAmountPaid;
	
	private List<TransactionDto> transactions;
	
	private String currentOutstandingStr;
	
	private double currentOutstanding;
}