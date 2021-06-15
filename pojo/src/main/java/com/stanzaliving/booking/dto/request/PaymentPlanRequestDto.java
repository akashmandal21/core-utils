package com.stanzaliving.booking.dto.request;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanRequestDto {
	@NotNull(message = "commercialCardRequestDto cannot be null")
	private CommercialCardRequestDto commercialCardRequestDto;

	@NotNull(message = "bookingDetailsRequestDto cannot be null")
	private BookingDetailsRequestDto bookingDetailsRequestDto;

	@NotNull(message = "bookingCommercialsRequestDto cannot be null")
	private BookingCommercialsRequestDto bookingCommercialsRequestDto;

	@Builder.Default
	private boolean savePaymentPlan = false;
}
