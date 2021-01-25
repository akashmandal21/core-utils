package com.stanzaliving.core.food.dto;

import java.time.DayOfWeek;
import java.time.LocalDate;

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
public class FoodOrderAttendanceDto {

	private LocalDate date;

	private DayOfWeek day;

	private Integer attendance;

	private Integer vegOrder;

	private Integer nonvegOrder;

	private Boolean shortage;

}
