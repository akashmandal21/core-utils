package com.stanzaliving.booking.dto.response;

import java.util.List;

import com.stanzaliving.booking.dto.BookingPaymentPlan;
import com.stanzaliving.booking.dto.InstallmentPaymentPlan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanResponseDto {

	private BookingPaymentPlan bookingPaymentPlan;
	private List<InstallmentPaymentPlan> installments;
}