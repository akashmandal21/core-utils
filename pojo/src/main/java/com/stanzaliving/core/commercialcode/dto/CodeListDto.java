package com.stanzaliving.core.commercialcode.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CodeListDto {
    private String uuid;

    private String commercialCodeName;

    private Double refundableDeposit;

    private Integer advanceRentalFirstMonths;

    private Integer advanceRentalLastMonths;

    private Double annualMaintenanceFee;

    private Double monthlyMaintenanceFee;

    private String maintenanceFeeCollection;

    private boolean isAutoApplicable;

    private Boolean isSecurityDepositManualInput;

    private Double monthlyFeesMultiplier;

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;
}
