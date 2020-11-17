package com.stanzaliving.core.payment.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 17-Nov-2020
 */

@Getter
@Setter
@SuperBuilder
@ToString
public class RefundTransactionDto {
	private String userId;

	private String serviceTransactionId;

	private StanzaPaymentService paymentService;

	private Double amount;

}
