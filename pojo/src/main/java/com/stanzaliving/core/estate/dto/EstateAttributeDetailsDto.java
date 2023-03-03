package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EstateAttributeDetailsDto{

    private String estateUuid;

    private String stiltNumberOfRooms;
    
    private String floorCount;
    
    private String effectiveBedCount;
    
    private String sizeOfPlot;
    
    private String areaOfLeasedPremise;
    
    private String areaOfProperty;
    
    private String facadeImages;
    
    private String rentFreePeriodInMonths;
    
    private String roomCount;
    
    private String buildingHandoverDate;

    private String monthlyRent;

    private String securityDepositMonthsOfRent;

    private String advanceRentMonthCount;

    private String leaseLockInPeriodInYears;

    private String leaseDurationInYears;

    private String rentalInflationInYears;


}
