/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculatorv2.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst" })
public class UtilitiesWaterCategoryV2Dto extends CategoryV2Dto {

    @Builder.Default
    private int waterRequirementPerPersonPerDay = 120;
    private int waterRequirementPerPersonPerDaySuggestedValue;
    private String waterRequirementPerPersonPerDaySuggestedValueReason;
    private int tankerRequirementPercent;
    private double tankerCostPerLtr;
    private double landlordReceivablePercent;
    private double waterCost;
    private double waterCostPerAvailableBed;
    private double jalBoardWaterCostPerMonth;
    private double jalBoardWaterCostPerAvailableBed;

    private int monthsWithTankerDependency;
    private double tankerCapacity;
    private double perTankerCost;
    private double landlordSharingPercent;

}
