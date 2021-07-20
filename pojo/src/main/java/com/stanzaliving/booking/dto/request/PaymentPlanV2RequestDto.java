package com.stanzaliving.booking.dto.request;

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
	private Double discountValueApplied;
}
