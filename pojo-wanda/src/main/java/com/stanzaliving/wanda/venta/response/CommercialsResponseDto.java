package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.wanda.enums.InstallmentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialsResponseDto {
    private String moveInDate;
    private String contractStartDate;
    private String contractPeriod;
    private double contractMonths;
    private int contractId;
    private String stayLockInPeriod;
    private String contractEndDate;
    private MonthlyFeeDto monthlyFee;
    private Double securityDeposit;
    private Double maintenanceFee;
    private Integer advanceMonths;
    private Double advanceFee;
    private String maxDate;
    private List<Map<String, String>> adjustedAdvanceRentalMonths;
    private InstallmentTypeEnum instalmentType;
    private ResidenceType residenceType;
    private Double maintenanceFeeAdjustedInSD;
    
}