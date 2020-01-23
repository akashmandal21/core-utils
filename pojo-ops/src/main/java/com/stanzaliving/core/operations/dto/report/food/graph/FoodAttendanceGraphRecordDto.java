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
public class FoodAttendanceGraphRecordDto extends GraphRecordDto {

    Integer movedInResidents;
    Integer presentStudents;
    Integer foodAttendance; //   /presentStudents
    Integer totalCount;
}
