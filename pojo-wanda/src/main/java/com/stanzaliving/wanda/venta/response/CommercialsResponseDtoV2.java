package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.booking.enums.*;

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
    private Double onBoardingCharges;
    private Double maintenanceFee;
    private Integer advanceMonths;
    private Double advanceFee;
    private String maxDate;
    private double upsell;
    private double bumpUpPrice;
    private MaintenanceFeeCollectionType maintenanceFeeCollectionType;
    private AMCAmountType maintenanceChargeAmountType;
    private List<Map<String, String>> adjustedAdvanceRentalMonths;
    private PaymentTerm instalmentType;
    private String propertyType;
    private Double maintenanceFeeAdjustedInSD;
    private DateRange stayLockInRange;
    private BookingType bookingType;
    private String subContract1StartDate; //add
    private String subContract1EndDate; //add
    private MonthlyFeeDtoV2 subContract2MonthlyFee; //add
    private String subContract2StartDate; //add
    private String subContract2EndDate; //add
    @Builder.Default
    private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;


}