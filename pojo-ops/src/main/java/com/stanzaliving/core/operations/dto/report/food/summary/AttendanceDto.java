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

	private int movedInResidents;

	private int occupiedBeds;

	private int presentStudents;

	private int totalMealsOrdered;

	private int foodAttendance;

}