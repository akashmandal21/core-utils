package com.stanzaliving.price_strategy.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CommercialActionDto {

    @NotBlank(message = "priceImpact can't be blank")
    private String priceImpact;
    @Max(value = 6, message = "Value must be an integer value less than 6")
    private Integer lastAdvancedRentalMonth;
    @Min(value = 15, message = "Value must be an integer value grater than 15")
    private Integer lastAdvancedRentalDays;
    @Builder.Default
    @Min(value = 1, message = "starting advance rental months cannot be negative or zero")
    private Integer advanceRentalFirstMonths = 1;
    private SecurityDepositDto securityDepositDto;
    private MaintenanceFeeDto maintenanceFeeDto;

}
