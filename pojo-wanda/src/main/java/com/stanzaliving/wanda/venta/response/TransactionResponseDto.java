package com.stanzaliving.wanda.venta.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDto {

	private String paymentMode;
	private String completionDate;
	private Double amount;
	private String internalTransactionId;
	private String merchantTransactionId;
	private Date transactionDate;
    private Boolean isLastTransaction;
    private String paymentStatus;
}
