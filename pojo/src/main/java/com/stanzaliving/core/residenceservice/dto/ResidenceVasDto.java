package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.residenceservice.enums.BillingFrequency;

import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ResidenceVasDto {
	private String residenceUuid;
	private String name;
	private String globalVasUuid;

	private BillingFrequency billingFrequency;
	private String serviceIcon;
	private Double price;
	private Double totalAmount;
	@Builder.Default
	private Double cgst = 0.0;
    @Builder.Default
	private Double sgst = 0.0;
    @Builder.Default
	private Double igst = 0.0;

	private BigDecimal csgtPercentage;

	private BigDecimal sgstPercentage;

	private BigDecimal igstPercentage;

	private VasCategory vasCategory;

}
