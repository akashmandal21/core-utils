package com.stanzaliving.wanda.food.response;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
public class FoodOrderTiming {

	private LocalDate cutoffDate;
	private LocalTime cutoffTime;
	private LocalTime startTime;
	private LocalTime endTime;
	private Date cutoffDateTime;		

}
