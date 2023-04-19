package com.stanzaliving.core.residenceservice.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import com.stanzaliving.booking.enums.PaymentTerm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class ResidencePaymentPlanDto {

	@NotBlank(message = "Residence Uuid cannot be blank")
	private String ResidenceUuid;

	private String uuid;

	private boolean noCostEmiApplicable;

	@NotBlank(message = "payment plan cannot be blank")
	private PaymentTerm paymentPlan;

	@Enumerated(EnumType.STRING)
	private String paymentPlanDesc;

}
