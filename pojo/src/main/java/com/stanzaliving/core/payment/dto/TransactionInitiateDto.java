/**
 * 
 */
package com.stanzaliving.core.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 16 Sep, 2020
 *
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionInitiateDto {

	private String paymentId;

	private String pgOrderId;

	private String callbackUrl;
	
	private Double amount;
	
	private String currency;
}