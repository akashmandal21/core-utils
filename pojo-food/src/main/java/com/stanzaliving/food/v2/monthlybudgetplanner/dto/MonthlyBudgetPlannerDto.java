package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.util.List;

import com.stanzaliving.core.vendor.enums.VendorType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MonthlyBudgetPlannerDto {
	
    //Basic Details
    private String vendorId;
    private String vendorName;
    private VendorType vendorType;
    private String menuCategoryShortCode;
    private Integer menuCategoryPerDayBudget;
    private List<String> tagNames;
    private Integer monthlyBudget;
    private Integer eventCount;
    
    //Day level (Planned/Budgeted)
    
    List<DayWiseBudgetDto> dayWiseBudgetDto;
    
}
