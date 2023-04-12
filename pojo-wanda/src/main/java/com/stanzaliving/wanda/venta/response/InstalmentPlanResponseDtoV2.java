package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.booking.enums.PaymentTerm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstalmentPlanResponseDtoV2 {
	private String name;
	private PaymentTerm paymentTerm;
	private Double upfrontPaymentMonth;
	private PaymentTerm installmentTypeEnum;
	private Boolean noCostEmiApplicable;
}