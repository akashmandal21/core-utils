package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.AMCAmountType;
import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialCardRequestDto implements Serializable {

	@Builder.Default
	@Min(value = 1, message = "starting advance rental months cannot be negative or zero")
	private Integer startingAdvanceRentalMonths = 1;
	
	@Builder.Default
	@Min(value = 0, message = "last advance rental months cannot be negative")
	private Integer lastAdvanceRentalMonths = 0;

	@Min(value = 0, message = "security deposit cannot be negative")
	private Double securityDeposit;

	@Min(value = 0, message = "maintenance fee cannot be negative")
	private Double maintenanceFee;


	@Min(value = 0, message = "onBoarding charge cannot be negative")
	private Double onBoardingCharges;
	
	@Builder.Default
	@NotNull(message = "maintenance fee collection type cannot be null")
	private MaintenanceFeeCollectionType maintenanceFeeCollectionType = MaintenanceFeeCollectionType.MONTHLY;

	private AMCAmountType maintenanceChargeAmountType;

	public CommercialCardRequestDto(CommercialCardRequestDto commercialCardRequestDto) {
	}
}
