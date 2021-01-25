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

    public DisplaySummaryDto(Double annualUnderwrittenValue, Double monthlySplitterValue) {
        this.annualUnderwrittenValue = annualUnderwrittenValue;
        this.monthlySplitterValue = monthlySplitterValue;
        setDeviationAndColorCode();
    }

    public DisplaySummaryDto(Integer annualUnderwrittenValue, Integer monthlySplitterValue) {
        this.annualUnderwrittenValue = annualUnderwrittenValue == null ? null : annualUnderwrittenValue.doubleValue();
        this.monthlySplitterValue = monthlySplitterValue == null ? null : monthlySplitterValue.doubleValue();
        setDeviationAndColorCode();
    }
    public DisplaySummaryDto(Double annualUnderwrittenValue, Integer monthlySplitterValue) {
        this.annualUnderwrittenValue = annualUnderwrittenValue;
        this.monthlySplitterValue = monthlySplitterValue == null ? null : monthlySplitterValue.doubleValue();
        setDeviationAndColorCode();
    }

    public DisplaySummaryDto(Integer annualUnderwrittenValue, Double monthlySplitterValue) {
        this.annualUnderwrittenValue = annualUnderwrittenValue == null ? null : annualUnderwrittenValue.doubleValue();
        this.monthlySplitterValue = monthlySplitterValue;
        setDeviationAndColorCode();
    }

    private void setDeviationAndColorCode() {
        if (NumberUtils.isEqualDouble(this.annualUnderwrittenValue, this.monthlySplitterValue)) {
            this.colorCode = ColorCode.SOFT_BLUE.getColorCode();
        } else if (this.monthlySplitterValue == null || monthlySplitterValue < annualUnderwrittenValue) {
            this.colorCode = ColorCode.MODERATE_CYAN.getColorCode();
        } else {
            this.colorCode = ColorCode.LIGHT_RED.getColorCode();
        }
        if (this.monthlySplitterValue != null) {
            this.deviationPercent = NumberUtils.isEqualDouble(0d, this.annualUnderwrittenValue) ? 0 : ((Math.abs(this.annualUnderwrittenValue - this.monthlySplitterValue) * 100) / this.annualUnderwrittenValue);
        } else {
            this.deviationPercent = null;
        }
    }

}
