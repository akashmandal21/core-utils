package com.stanzaliving.price_strategy.request;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CommercialActionDto {

    private String priceImpact;
    private Double advancedRentalLastMonth;
    private SecurityDepositDto securityDepositDto;
    private MaintenanceFeeDto maintenanceFeeDto;

}
