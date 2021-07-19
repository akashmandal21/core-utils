package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanRequestDto implements Serializable {
	
	@NotNull(message = "commercialCardRequestDto cannot be null")
	@Valid
	private CommercialCardRequestDto commercialCardRequestDto;
	
	@NotNull(message = "bookingDetailsRequestDto cannot be null")
	@Valid
	private BookingDetailsRequestDto bookingDetailsRequestDto;
	
	@NotNull(message = "bookingCommercialsRequestDto cannot be null")
	@Valid
	private BookingCommercialsRequestDto bookingCommercialsRequestDto;

	private DiscountRequestDto discount;

	@Builder.Default
	private boolean isWpBooking = false;
	
	@Builder.Default
	private boolean savePaymentPlan = false;

	@Builder.Default
	private boolean isModifyContract = false;



}
