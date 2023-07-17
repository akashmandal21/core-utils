package com.stanzaliving.core.commercialcode.dto;
import com.stanzaliving.booking.enums.AMCAmountType;
import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.booking.enums.PaymentFrequency;
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
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

    private Integer lastAdvanceRentalDays;

    private Double annualMaintenanceFee;

    private Double monthlyMaintenanceFee;

    // ----> Monthly / upfront
    private String maintenanceFeeCollection;

    private boolean isAutoApplicable;

    private Boolean isSecurityDepositManualInput;

    private Double monthlyFeesMultiplier;

    private Double onBoardingCharges;

    private Double onBoardingChargesPercentage;

    private Boolean onboardingChargesApplicableOnRetention;

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    // ----> Monthly / Fixed
    private AMCAmountType maintenanceChargeAmountType;

    private CommercialCardStatus cardStatus;

    private BookingSubType bookingSubType;

    private PlatformType platform;

    private PaymentFrequency paymentFrequency;

    private String priceImpact;

    private CommercialCardUserType userType;

    private AMCAmountType onBoardingChargeType;

    private AMCAmountType exitProcessingType;

    private Double exitProcessingCharges;
}
