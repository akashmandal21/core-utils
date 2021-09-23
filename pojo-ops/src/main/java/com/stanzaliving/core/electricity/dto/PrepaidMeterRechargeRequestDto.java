package com.stanzaliving.core.electricity.dto;

import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @date 22-SEPT-2021
 *
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PrepaidMeterRechargeRequestDto {

	@NotEmpty(message = "userId is a required field")
	private String userId;

	@NotEmpty(message = "propertyId is a required field")
	private String propertyId;

	@NotEmpty(message = "meterId is a required field")
	private String meterId;
	
	@NotEmpty(message = "amount is a required field")
	private Double amount;
	
	private StanzaPaymentService stanzaPaymentService;
	
	private String transactionId;
	
	private PaymentMode paymentMode;

}