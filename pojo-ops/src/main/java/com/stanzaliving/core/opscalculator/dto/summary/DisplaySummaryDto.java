package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.base.enums.ColorCode;
import com.stanzaliving.core.base.utils.NumberUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class DisplaySummaryDto {
    Double annualUnderwrittenValue;         //should be Object
    Double monthlySplitterValue;            //should be Object
    String colorCode;
    Double deviationPercent;

    public DisplaySummaryDto(double annualUnderwrittenValue, double monthlySplitterValue) {
        this.annualUnderwrittenValue = annualUnderwrittenValue;
        this.monthlySplitterValue = monthlySplitterValue;
        if (NumberUtils.isEqualDouble(this.annualUnderwrittenValue, this.monthlySplitterValue)) {
            this.colorCode = ColorCode.SOFT_BLUE.getColorCode();
        } else if (monthlySplitterValue < annualUnderwrittenValue) {
            this.colorCode = ColorCode.MODERATE_CYAN.getColorCode();
        } else {
            this.colorCode = ColorCode.LIGHT_RED.getColorCode();
        }
        this.deviationPercent = NumberUtils.isEqualDouble(0d, annualUnderwrittenValue) ? 0 : ((Math.abs(annualUnderwrittenValue - monthlySplitterValue) * 100) / annualUnderwrittenValue);
    }

}
