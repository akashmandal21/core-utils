package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsiteSelfRefundResponseDto {

	private boolean refundable;
	
	private boolean exploreResidencesButton;
	
	private String displayMessage;
	
	private String referenceId;
	
	private LeadRequestDto leadRequestDto;
	
	private WebsitePrebookingPaymentRefundDetailsDto websitePrebookingPaymentRefundDetailsDto;
}
