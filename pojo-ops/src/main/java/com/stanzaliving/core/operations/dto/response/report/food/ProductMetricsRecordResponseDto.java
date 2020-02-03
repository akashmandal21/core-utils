package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProductMetricsRecordResponseDto extends RecordDto {

    FeElementDto meals;

    FeElementDto menuCreated;

    FeElementDto ordersCreated;

    FeElementDto foodReceived;

    FeElementDto shortageFilled;

    FeElementDto leftoverFilled;

    FeElementDto feedbackGiven;

    String mealUuid;

    String mealName;
}
