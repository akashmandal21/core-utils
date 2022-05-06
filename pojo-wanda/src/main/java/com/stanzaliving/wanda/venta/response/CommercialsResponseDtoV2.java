package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import com.stanzaliving.booking.enums.PaymentTerm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialsResponseDtoV2 {
    private String moveInDate;
    private String contractStartDate;
    private String contractPeriod;
    private double contractMonths;
    private int contractId;
    private String stayLockInPeriod;
    private String contractEndDate;
    private String lockInEndDate;
    private MonthlyFeeDtoV2 monthlyFee;
    private Double securityDeposit;
    private Double maintenanceFee;
    private Integer advanceMonths;
    private Double advanceFee;
    private Double onBoardingCharges;
    private String maxDate;
    private double upsell;
    private MaintenanceFeeCollectionType maintenanceFeeCollectionType;
    private List<Map<String, String>> adjustedAdvanceRentalMonths;
    private PaymentTerm instalmentType;
    private String propertyType;
    private Double maintenanceFeeAdjustedInSD;
    private DateRange stayLockInRange;
    private BookingType bookingType;
    private String lockInEndDate;
    private String subContract1StartDate; //add 
    private String subContract1EndDate; //add
    private MonthlyFeeDtoV2 subContract2MonthlyFee; //add
    private String subContract2StartDate; //add 
    private String subContract2EndDate; //add
    
}