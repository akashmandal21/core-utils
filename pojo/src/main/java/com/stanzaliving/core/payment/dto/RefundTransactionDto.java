package com.stanzaliving.core.payment.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

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
@NoArgsConstructor
@AllArgsConstructor
public class RefundTransactionDto {
	private String userId;

	private String serviceTransactionId;

	@NotBlank(message = "refundRequestId is mandatory for refund")
	private String refundRequestId;

	private StanzaPaymentService paymentService;

	private Double amount;

}
