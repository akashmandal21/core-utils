package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.*;
import com.stanzaliving.core.paymentPlan.dto.VasRequestDto;
import com.stanzaliving.price_strategy.request.PaymentActionDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@SuperBuilder
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

	private PaymentActionDto paymentActionDto;

	private boolean subscriptionPlansToBeRemoved;

	private VasRequestDto vasRequestDto;
}
