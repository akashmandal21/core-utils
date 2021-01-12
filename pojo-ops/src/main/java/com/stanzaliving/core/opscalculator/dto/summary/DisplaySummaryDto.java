package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.base.enums.ColorCode;
import com.stanzaliving.core.base.utils.NumberUtils;
import com.stanzaliving.core.operations.enums.FeElementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class DisplaySummaryDto {
    Double annualUnderwrittenValue;         //should be Object
    Double monthlySplitterValue;            //should be Object
    String colorCode;
    Double deviationPercent;
//    @Builder.Default
//    FeElementType feElementType = FeElementType.CURRENCY_INTEGER;


    public DisplaySummaryDto(double annualUnderwrittenValue, double monthlySplitterValue, boolean isDeviation) {
        this.annualUnderwrittenValue = annualUnderwrittenValue;
        this.monthlySplitterValue = monthlySplitterValue;
        if (NumberUtils.isEqualDouble(this.annualUnderwrittenValue, this.monthlySplitterValue)) {
            this.colorCode = ColorCode.BLUE.getColorCode();
        } else if (monthlySplitterValue < annualUnderwrittenValue) {
            this.colorCode = ColorCode.GREEN.getColorCode();
        } else {
            this.colorCode = ColorCode.RED.getColorCode();
        }
        
        if(isDeviation){
            this.deviationPercent = (annualUnderwrittenValue-monthlySplitterValue)/annualUnderwrittenValue;
        }
    }

//    public DisplaySummaryDto(Integer annualUnderwrittenValue, Integer monthlySplitterValue) {
//        this.annualUnderwrittenValue = annualUnderwrittenValue.doubleValue();
//        this.monthlySplitterValue = monthlySplitterValue.doubleValue();
//        if (NumberUtils.isEqualDouble(this.annualUnderwrittenValue, this.monthlySplitterValue)) {
//            this.colorCode = ColorCode.BLUE.getColorCode();
//        } else if (monthlySplitterValue.compareTo(annualUnderwrittenValue) < 0) {
//            this.colorCode = ColorCode.GREEN.getColorCode();
//        } else {
//            this.colorCode = ColorCode.RED.getColorCode();
//        }
//    }

    //delete this constructor, used for dummy api's for now
    public DisplaySummaryDto() {
        this.annualUnderwrittenValue = 100d * Math.random();
        this.monthlySplitterValue = 100d * Math.random();
        if (NumberUtils.isEqualDouble(this.annualUnderwrittenValue, this.monthlySplitterValue)) {
            this.colorCode = ColorCode.BLUE.getColorCode();
        } else if (monthlySplitterValue.compareTo(annualUnderwrittenValue) < 0) {
            this.colorCode = ColorCode.GREEN.getColorCode();
        } else {
            this.colorCode = ColorCode.RED.getColorCode();
        }
    }
}
