package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContractModificationDetailsDto {

	private String studentId;
	private String studentName;
	private String studentEmail;
	private String contractStartDate;
	private String contractEndDate;
	private double monthlyFee;
	private double amc;
	private double securityDeposit;
	private double onboardingCharges;
	private double discountAmount;
	private double advanceRentalMonths;
	private double totalAmount;
	private String addendumLink;
	private String subContract1EndDate;
	private String approvalUrl;
	
}
