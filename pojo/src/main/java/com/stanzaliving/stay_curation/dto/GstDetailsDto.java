
package com.stanzaliving.stay_curation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GstDetailsDto {

    private Double cGstPercentage;

    private Double sGstPercentage;

    private Double iGstPercentage;

    private Double multiplierValue;

    private static Double roundToTwoDecimalPlaces(Double multiplierValue) {
        multiplierValue = multiplierValue * 100;
        multiplierValue = (double) Math.round(multiplierValue);
        multiplierValue /= 100;
        return multiplierValue;
    }

    public Double getMultiplierValue() {
        Double multiplierValue = 1d;
        if (Objects.nonNull(this.cGstPercentage)) {
            multiplierValue += this.cGstPercentage / 100;
        }
        if (Objects.nonNull(this.sGstPercentage)) {
            multiplierValue += this.sGstPercentage / 100;
        }
        if (Objects.nonNull(this.iGstPercentage)) {
            multiplierValue += this.iGstPercentage / 100;
        }
        return roundToTwoDecimalPlaces(multiplierValue);
    }

}
