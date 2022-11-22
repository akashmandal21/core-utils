package com.stanzaliving.core.paymentPlan.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
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
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlan {
	private String uuid;
	private Long id;
	private LocalDate fromDate;
	private LocalDate toDate;
	private Double amount;
	private LocalDate executionDate;
	private String referenceId;
	private ReferenceType referenceType;
	private PaymentPlanType paymentPlanType;
	private Map<String, String> metaData;
	private String invoiceUuid;
	private List<PaymentPlanLineItem> lineItems;

	//private Date createdAt;

	private String createdBy;

	//private Date updatedAt;

	private String updatedBy;

	private boolean status;
}
