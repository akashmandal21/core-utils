package com.stanzaliving.collector.dto;

import com.stanzaliving.core.enums.ResidenceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRentAggregationDto {
    private String ventaUserUuid;
    private String ventaUserName;
    private String bookingUuid;
    private String residenceUuid;
    private String micromarketUuid;
    private String cityUuid;
    private Double tillDateInvoiceAmount;
    private Double tillDatePending;
    private Double securityDeposit;
    private Integer advanceRentalDuration;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private ResidenceType residenceType;
    private LocalDate lastInternetUsedDate;
    private LocalDate lastPaymentDate;
    private String bookingStatus;
    private Boolean hasMovedIn;
    private Double advanceRentalAmount;
    private LocalDate advanceRentalFromDate;
    private LocalDate advanceRentalToDate;
}
