package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.PercentDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDto {

    int occupiedBeds;

    int movedInStudents;

    PercentDto present;

    PercentDto mealOrdered;

    PercentDto foodAttendance;

}
