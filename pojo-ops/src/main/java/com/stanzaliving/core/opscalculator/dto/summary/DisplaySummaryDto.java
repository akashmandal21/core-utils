package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.base.enums.ColorCode;
import com.stanzaliving.core.base.utils.NumberUtils;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DisplaySummaryDto {
    @Builder.Default
    private Double annualUnderwrittenValue = 0d;         //should be Object
    @Builder.Default
    private Double monthlySplitterValue = 0d;            //should be Object
    @Builder.Default
    private Double monthlyForecastValue = 0d;
    @Builder.Default
    private String colorCode = ColorCode.BLACK.getColorCode();
    @Builder.Default
    private Double deviationPercent = 0d;                //if AOP, then between annual and monthlySplitter, else if forecast, then between splitter and forecast
    @Builder.Default
    private Double annualUnderWrittenBaseValue = 0d;     //if AOP, then between annual and monthlySplitter, else if forecast, then between splitter and forecast
    @Builder.Default
    private Double monthlySplitterBaseValue = 0d;
    @Builder.Default
    private Double monthlyForecastBaseValue = 0d;

    public void setMonthlyForecastBaseValue(Double monthlyForecastBaseValue) {
        this.monthlyForecastBaseValue = monthlyForecastBaseValue == null ? 0d : monthlyForecastBaseValue;
        monthlyForecastValue = monthlyForecastBaseValue;
    }

    public DisplaySummaryDto(Double annualUnderwrittenValue, Double monthlySplitterValue) {
        this.annualUnderWrittenBaseValue = annualUnderwrittenValue == null ? 0d : annualUnderwrittenValue;
        this.monthlySplitterBaseValue = monthlySplitterValue == null ? 0d : monthlySplitterValue;
        this.annualUnderwrittenValue = annualUnderWrittenBaseValue;
        this.monthlySplitterValue = monthlySplitterBaseValue;
        setDeviationAndColorCode();
    }

    public DisplaySummaryDto(Integer annualUnderwrittenValue, Integer monthlySplitterValue) {
        this.annualUnderWrittenBaseValue = annualUnderwrittenValue == null ? 0d : annualUnderwrittenValue.doubleValue();
        this.monthlySplitterBaseValue = monthlySplitterValue == null ? 0d : monthlySplitterValue.doubleValue();
        this.annualUnderwrittenValue = annualUnderWrittenBaseValue;
        this.monthlySplitterValue = monthlySplitterBaseValue;
        setDeviationAndColorCode();
    }
    public DisplaySummaryDto(Double annualUnderwrittenValue, Integer monthlySplitterValue) {
        this.annualUnderWrittenBaseValue = annualUnderwrittenValue == null ? 0d : annualUnderwrittenValue;
        this.monthlySplitterBaseValue = monthlySplitterValue == null ? 0d : monthlySplitterValue.doubleValue();
        this.annualUnderwrittenValue = annualUnderWrittenBaseValue;
        this.monthlySplitterValue = monthlySplitterBaseValue;
        setDeviationAndColorCode();
    }

    public DisplaySummaryDto(Integer annualUnderwrittenValue, Double monthlySplitterValue) {
        this.annualUnderWrittenBaseValue = annualUnderwrittenValue == null ? 0d : annualUnderwrittenValue.doubleValue();
        this.monthlySplitterBaseValue = monthlySplitterValue == null ? 0d : monthlySplitterValue;
        this.annualUnderwrittenValue = annualUnderWrittenBaseValue;
        this.monthlySplitterValue = monthlySplitterBaseValue;
        setDeviationAndColorCode();
    }

    public void setDeviationAndColorCode() {
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

    public void add(DisplaySummaryDto displaySummaryDto) {
        if (null == displaySummaryDto) {
            return;
        }
        NumberUtils.sumDouble(this.annualUnderwrittenValue , displaySummaryDto.getAnnualUnderwrittenValue());
        NumberUtils.sumDouble(this.monthlySplitterValue , displaySummaryDto.getMonthlySplitterValue());
        NumberUtils.sumDouble(this.monthlyForecastValue , displaySummaryDto.getMonthlyForecastValue());
        NumberUtils.sumDouble(this.annualUnderWrittenBaseValue , displaySummaryDto.getAnnualUnderWrittenBaseValue());
        NumberUtils.sumDouble(this.monthlySplitterBaseValue , displaySummaryDto.getMonthlySplitterBaseValue());
        NumberUtils.sumDouble(this.monthlyForecastBaseValue , displaySummaryDto.getMonthlyForecastBaseValue());
    }

    public void setForeCastValueSameAsSplitterValue() {
        this.monthlyForecastValue = this.monthlySplitterValue;
        this.monthlyForecastBaseValue = this.monthlySplitterBaseValue;
    }
}
