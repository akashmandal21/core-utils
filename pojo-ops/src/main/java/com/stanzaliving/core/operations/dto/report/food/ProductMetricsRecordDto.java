package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProductMetricsRecordDto extends RecordDto {

    int mealsCount;

    int menuCreated;

    int orderCreated;

    int foodReceived;

    int shortageFilled;

    int leftoverFilled;

    int rcFeedbackGiven;

    String mealUuid;

    String mealName;

}
