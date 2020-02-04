package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.request.report.food.CostEfficiencyFoodReportRequestDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MealCountRecordDto extends RecordDto implements Cloneable {

    private int overallCount;

    private int breakfastCount;

    private int lunchCount;

    private int snacksCount;

    private int dinnerCount;

    private int brunchCount;

    private int lunchTiffinCount;

    public MealCountRecordDto clone() {
        return (MealCountRecordDto) super.clone();
    }

}
