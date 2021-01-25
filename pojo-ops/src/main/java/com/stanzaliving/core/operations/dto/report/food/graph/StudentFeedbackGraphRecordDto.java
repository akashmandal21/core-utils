package com.stanzaliving.core.operations.dto.report.food.graph;

import com.stanzaliving.core.operations.dto.report.GraphRecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StudentFeedbackGraphRecordDto extends GraphRecordDto {

    Integer disgusted;
    Integer dissatisfied;
    Integer satisfied;
    Integer delighted;
    Integer studentFeedbackCount;

}
