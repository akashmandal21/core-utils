package com.stanzaliving.core.operations.dto.response.report.food.summary;

import com.stanzaliving.core.operations.dto.response.report.FeElementDto;

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
public class AttendanceResponseDto {

	private FeElementDto occupiedBeds;

	private FeElementDto movedInStudents;

	private FeElementDto present;

	private FeElementDto mealOrdered;

	private FeElementDto foodAttendance;

}