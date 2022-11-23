package com.stanzaliving.food.v2.category.dto;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;

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
public class DayWiseCogsDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private LocalDate menuDate;
	private DayOfWeek dayOfWeek;
	private Double cogs;
	private Double budgeted;
}
