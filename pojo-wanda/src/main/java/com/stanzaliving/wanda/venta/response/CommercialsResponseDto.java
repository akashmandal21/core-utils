package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialsResponseDto {
    private String moveInDate;
    private String contractStartDate;
    private String contractPeriod;
    private String stayLockInPeriod;
    private String contractEndDate;
    private MonthlyFeeDto monthlyFee;
    private Double securityDeposit;
    private Double maintenanceFee;
    private Integer advanceMonths;
    private Double advanceFee;
    private List<Map<String, String>> adjustedAdvanceRentalMonths;
}
