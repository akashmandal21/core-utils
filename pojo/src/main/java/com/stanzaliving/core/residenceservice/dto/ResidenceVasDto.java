package com.stanzaliving.core.residenceservice.dto;

import java.math.BigDecimal;

import com.stanzaliving.core.residenceservice.enums.BillingFrequency;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ResidenceVasDto {
	private String residenceUuid;
	private String name;

	private String globalVasUuid;

	private BillingFrequency billingFrequency;

	private BigDecimal price;

	private BigDecimal gst;
	private BigDecimal totalAmount;

}
