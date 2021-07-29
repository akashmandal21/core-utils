package com.stanzaliving.core.residenceservice.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

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

	@NotBlank(message = "payment plan cannot be blank")
	private String paymentPlan;

	@Enumerated(EnumType.STRING)
	private String paymentPlanDesc;

}
