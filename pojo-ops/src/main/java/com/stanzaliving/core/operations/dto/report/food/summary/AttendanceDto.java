package com.stanzaliving.core.operations.dto.report.food.summary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDto {
	
	int movedInResidents;
	
    int occupiedBeds;

    int presentStudents;

    int totalMealsOrdered;

    int foodAttendance;

}
