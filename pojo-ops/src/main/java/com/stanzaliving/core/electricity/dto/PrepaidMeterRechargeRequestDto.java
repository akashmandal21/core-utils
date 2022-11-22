package com.stanzaliving.core.electricity.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

	@NotBlank(message = "userId is a required field")
	private String userId;
	
	@NotBlank(message = "userCode is a required field")
	private String userCode;

	@NotBlank(message = "residenceId is a required field")
	private String residenceId;

	@NotBlank(message = "meterId is a required field")
	private String meterId;
	
	@NotNull(message = "amount is a required field")
	@DecimalMin(value = "1.0")
	private Double amount;
	
	@NotNull(message = "StanzaPaymentService is a required field")
	private StanzaPaymentService stanzaPaymentService;
	
	@NotNull(message = "PaymentMode is a required field")
	private PaymentMode paymentMode;

}