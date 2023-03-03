/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculatorv2.dto;

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
public class LaundryCategoryV2Dto extends CategoryV2Dto {

    @Builder.Default
    private int clothesPerPersonPerMonth = 40;
    private int clothesPerPersonPerMonthSuggested;
    private String clothesPerPersonPerMonthSuggestedReason;
    @Builder.Default
    private double weightPerCloth = 0.25;
    private double costPerKg;
    @Builder.Default
    private int utilizationPercent = 65;
    private int utilizationPercentSuggested;
    private String utilizationPercentSuggestedReason;
    private boolean leninLaundryInclude;
    private double leninCost;

}
