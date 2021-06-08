package com.stanzaliving.core.commercialcode.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardListDto {

    private String uuid;

    private String commercialCodeName;

    private Double refundableDeposit;

    private Integer advanceRentalFirstMonths;

    private Integer advanceRentalLastMonths;

    private Double annualMaintenanceFee;

    private String maintenanceFeeCollection;

    private String advanceRentalMonths;
}
