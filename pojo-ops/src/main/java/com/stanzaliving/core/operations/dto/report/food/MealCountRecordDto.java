package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MealCountRecordDto extends RecordDto {

    private int overallCount;

    private int breakfastCount;

    private int lunchCount;

    private int snacksCount;

    private int dinnerCount;

    private int brunchCount;

    private int lunchTiffinCount;

}
