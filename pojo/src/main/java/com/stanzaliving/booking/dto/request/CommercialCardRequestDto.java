package com.stanzaliving.booking.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialCardRequestDto {

	@NotNull(message = "commercialCardId cannot be null")
	private String commercialCardUuid;

	@Builder.Default
	private Integer startingAdvanceRentalMonths = 1;

	@Builder.Default
	private Integer lastAdvanceRentalMonths = 0;

	private Double securityDeposit;

	private Double maintenanceFee;

	@Builder.Default
	private MaintenanceFeeCollectionType maintenanceFeeCollectionType = MaintenanceFeeCollectionType.MONTHLY;

}
