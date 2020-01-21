package com.stanzaliving.core.operations.dto.report.food.graph;

import com.stanzaliving.core.operations.dto.report.GraphRecordDto;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StudentFeedbackGraphRecordDto extends GraphRecordDto {

    Integer totalRating;
    Integer studentFeedbackCount;

}
