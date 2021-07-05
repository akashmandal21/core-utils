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
	
	@Builder.Default
	private boolean savePaymentPlan = false;

	private boolean isModifyContract = false;

}
