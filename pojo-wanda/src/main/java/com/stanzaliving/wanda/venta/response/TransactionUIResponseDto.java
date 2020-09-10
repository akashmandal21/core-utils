/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionUIResponseDto {

	private String paymentMode;
	private String completionDate;
	private String amount;
	private String internalTransactionId;
	private String merchantTransactionId;
	private String transactionDate;
	private String transactionTime;
	
}
