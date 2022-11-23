package com.stanzaliving.core.food.dto.response;

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
public class UtilisationDetailsDto {

	private UtilisationDto currentDay;
	private UtilisationDto previousDay;
	private UtilisationDto currentMinus6Day;
	private UtilisationDto last7DayAvgUtilization;
	private UtilisationDto last14DayAvgUtilization;
	private UtilisationDto last30DayAvgUtilization;

}
