package com.stanzaliving.price_strategy.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CommercialActionDto {

    @NotBlank(message = "priceImpact can't be blank")
    private String priceImpact;
    private Double advancedRentalLastMonth;

    @Builder.Default
    private Double advanceRentalFirstMonths = 1.0;
    private SecurityDepositDto securityDepositDto;
    private MaintenanceFeeDto maintenanceFeeDto;

}
