package com.stanzaliving.core.paymentPlan.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import com.stanzaliving.booking.enums.PaymentPlanType;
import com.stanzaliving.booking.enums.ReferenceType;

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
public class PaymentPlan {
	protected String uuid;
	private Long id;
	private LocalDate fromDate;
	private LocalDate toDate;
	private Double amount;
	private LocalDate executionDate;
	private String referenceId;
	private ReferenceType referenceType;
	private PaymentPlanType paymentPlanType;
	private Map<String, String> metaData;

	private PaymentPlanLineItem discountLineItem;
}
