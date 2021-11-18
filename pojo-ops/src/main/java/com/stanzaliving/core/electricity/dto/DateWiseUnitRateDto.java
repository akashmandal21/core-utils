package com.stanzaliving.core.electricity.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DateWiseUnitRateDto {

	private LocalDate startDate;
	private LocalDate endDate;
	private double unitRate;
	private double gstPercent;
	private String userCode;
		
}