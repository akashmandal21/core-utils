package com.stanzaliving.booking.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.booking.enums.PaymentTerm;

import com.stanzaliving.booking.enums.ResidenceAgreementType;
import com.stanzaliving.price_strategy.request.PaymentActionDto;
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
	private Double bumpUpPrice;
	private String bookingUuid;
	private DiscountRequestDto discount;
	@Builder.Default
	private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;
	
	@Builder.Default
	private boolean savePaymentPlan = false;
	@Builder.Default
	private boolean modifyContract = false;
	@Builder.Default
	@NotNull(message = "payment term cannot be null")
	private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;

	@Builder.Default
	private Boolean isPriceStrategy = false;

	private PaymentActionDto paymentActionDto;

	private boolean subscriptionPlansToBeRemoved;
}
