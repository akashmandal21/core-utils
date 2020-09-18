package com.stanzaliving.wanda.dtos;

import lombok.Setter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {

	private Double amount;
	
	private String amountStr;
	
	private String transactionName;
	
	private String transactionDate;
}
