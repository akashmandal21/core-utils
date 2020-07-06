package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Map;

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
    private String stayLockInPeriod;
    private String contractEndDate;
    private MonthlyFeeDto monthlyFee;
    private Double securityDeposit;
    private Double maintenanceFee;
    private Integer advanceMonths;
    private Double advanceFee;
    private List<Map<String, String>> adjustedAdvanceRentalMonths;
}