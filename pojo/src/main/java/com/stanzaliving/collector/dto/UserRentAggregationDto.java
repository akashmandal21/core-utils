package com.stanzaliving.collector.dto;

import com.stanzaliving.core.enums.ResidenceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRentAggregationDto {
    String ventaUserUuid;
    String ventaUserName;
    String bookingUuid;
    String residenceUuid;
    String micromarketUuid;
    String cityUuid;
    Double tillDateInvoiceAmount;
    Double tillDatePending;
    Double securityDeposit;
    Integer advanceRentalDuration;
    LocalDate contractStartDate;
    LocalDate contractEndDate;
    ResidenceType residenceType;
    LocalDate lastInternetUsedDate;
    LocalDate lastPaymentDate;
    String bookingStatus;
    Boolean hasMovedIn;
    Double advanceRentalAmount;
    LocalDate advanceRentalFromDate;
    LocalDate advanceRentalToDate;
}
