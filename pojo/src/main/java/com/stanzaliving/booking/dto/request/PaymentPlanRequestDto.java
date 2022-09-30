package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.booking.enums.ResidenceAgreementType;
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

//	@NotNull(message = "PricingStrategyRequestDto cannot be null")
//	@Valid
	private PricingStrategyRequestDto pricingStrategyRequestDto;

	@NotNull(message = "bookingDetailsRequestDto cannot be null")
	@Valid
	private BookingDetailsRequestDto bookingDetailsRequestDto;
	
	@NotNull(message = "bookingCommercialsRequestDto cannot be null")
	@Valid
	private BookingCommercialsRequestDto bookingCommercialsRequestDto;

	private DiscountRequestDto discount;

	@Builder.Default
	private Boolean isWpBooking = false;

	@Builder.Default
	private Boolean savePaymentPlan = false;

	@Builder.Default
	private Boolean modifyContract = false;

	@Builder.Default
	private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;

	@Builder.Default
	private double managementFeePercentage = 0.0;

}
