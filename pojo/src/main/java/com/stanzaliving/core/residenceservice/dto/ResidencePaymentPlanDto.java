package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

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

	@NotBlank(message = "payment plan cannot be blank")
	private PaymentTerm paymentPlan;

	@Enumerated(EnumType.STRING)
	private String paymentPlanDesc;

}
