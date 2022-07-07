package com.stanzaliving.core.commercialcode.dto;

<<<<<<< HEAD
import com.stanzaliving.booking.enums.AMCAmountType;
=======
>>>>>>> 86710781b89daa1f8b770e4fa5d422643586b6ec
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
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

    private Double onBoardingCharges;

    private Double onBoardingChargesPercentage;

    private Boolean onboardingChargesApplicableOnRetention;

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    private AMCAmountType maintenanceChargeAmountType;

    private CommercialCardStatus cardStatus;
}
