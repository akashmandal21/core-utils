package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.booking.enums.AMCAmountType;
import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CommercialCardResponseDto {

    private CommercialCardStatus cardStatus;

    private String uuid;

    @NotBlank(message = "Commercial Code Name cannot be empty")
    @NotNull(message = "Commercial code can't be null")
    private String commercialCodeName;

    private Date startDate;

    private Date endDate;

    private List<CommercialCardApplicabilityDto> commercialCardApplicabilityDto;

    @NotNull(message = "User Type can't be null")
    private CommercialCardUserType userType;

    @NotNull(message = "Applicability can't be null")
    private boolean isAutoApplicable;

    private Double refundableDeposit;

    private Double annualMaintenanceFee;

    private Double monthlyMaintenanceFee;

    private Double securityDeposit;

    private Double onBoardingCharges;

    private Double onBoardingChargesPercentage;

    private Boolean onboardingChargesApplicableOnRetention;

    private Integer advanceRentalFirstMonths;

    private Integer advanceRentalLastMonths;

    private Integer lastAdvancedRentalDays;

    @Min(value = 1, message = "Minimum Closure Applicable value must be 1")
    @Max(value = 1000000, message = "Maximum Closure Applicable value is 1000000")
    private Integer availableCount;
    
    private MaintenanceFeeCollectionType collectionStrategy;

    private Boolean isSecurityDepositManualInput;

    private Double monthlyFeesMultiplier;

    private AMCAmountType maintenanceChargeAmountType;

    private String priceImpactPercentage;

    private boolean priceStrategyEnabled;

}