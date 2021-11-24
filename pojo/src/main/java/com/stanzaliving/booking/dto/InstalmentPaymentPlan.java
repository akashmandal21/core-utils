package com.stanzaliving.booking.dto;

import java.util.List;

import com.stanzaliving.booking.dto.response.PaymentPlanLineItemResponse;
import com.stanzaliving.booking.enums.PaymentPlanResponseType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstalmentPaymentPlan {

	private PaymentPlanResponseType type;

	private String label;

	private double amount;

	private String period;
	
	private String fromDate;
   
	private String toDate;

	private String executionDate;

	private List<PaymentPlanLineItemResponse> lineItems;

	private String invoiceUuid;
}
