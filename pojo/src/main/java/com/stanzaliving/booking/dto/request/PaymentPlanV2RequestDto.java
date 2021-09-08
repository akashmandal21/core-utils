package com.stanzaliving.booking.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.booking.enums.PaymentTerm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanV2RequestDto {

	private Double upsell;
	private String bookingUuid;
	private DiscountRequestDto discount;
	
	@Builder.Default
	private boolean savePaymentPlan = false;
	@Builder.Default
	private boolean modifyContract = false;
	@Builder.Default
	@NotNull(message = "payment term cannot be null")
	private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;
	
}
