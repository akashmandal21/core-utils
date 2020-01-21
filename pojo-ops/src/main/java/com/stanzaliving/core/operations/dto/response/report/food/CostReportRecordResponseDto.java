package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CostReportRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostReportRecordResponseDto extends RecordDto {

    FeElementDto onTimeOrder;

    MealResponseDto costInThousand;

    public CostReportRecordResponseDto(CostReportRecordDto costReportRecordDto) {
        super(costReportRecordDto);
        this.onTimeOrder = new FeElementDto(costReportRecordDto.getOnTimeOrder());
        this.costInThousand = MealResponseDto.builder()
                .overall(new FeElementDto(costReportRecordDto.getCost().getOverall()/1000))
                .breakfast(new FeElementDto(costReportRecordDto.getCost().getBreakfast()/1000))
                .lunch(new FeElementDto(costReportRecordDto.getCost().getLunch()/1000))
                .snacks(new FeElementDto(costReportRecordDto.getCost().getSnacks()/1000))
                .dinner(new FeElementDto(costReportRecordDto.getCost().getDinner()/1000))
                .brunch(new FeElementDto(costReportRecordDto.getCost().getBrunch()/1000))
                .build();
    }

}
