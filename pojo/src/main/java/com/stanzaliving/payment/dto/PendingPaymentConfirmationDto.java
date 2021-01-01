/**
 * 
 */
package com.stanzaliving.payment.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class PendingPaymentConfirmationDto {

	private Long stanzaTransactionId;
	private String merchantTransactionId;
	private PaymentMode paymentMode;
	private String paymentModeDesc;
	private int paymentModeId;
	private String chequeNumber;
	private String chequeUrl;
}
