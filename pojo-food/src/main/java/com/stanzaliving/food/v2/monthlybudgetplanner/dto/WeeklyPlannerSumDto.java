package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class WeeklyPlannerSumDto implements Serializable {

	private static final long serialVersionUID = 1635296868115644218L;

	private LocalDate startDate;
	private LocalDate endDate;
	private Double total;

}
