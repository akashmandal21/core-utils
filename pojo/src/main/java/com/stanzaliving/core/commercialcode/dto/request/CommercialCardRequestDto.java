package com.stanzaliving.core.commercialcode.dto.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import com.stanzaliving.core.commercialcode.dto.CommercialCardApplicabilityDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardRequestDto {
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

    private Integer advanceRentalFirstMonths;

    private Integer advanceRentalLastMonths;

    @Min(value = 1, message = "Minimum Closure Applicable value must be 1")
    @Max(value = 1000000, message = "Maximum Closure Applicable value is 1000000")
    private Integer availableCount;

}