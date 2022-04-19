package com.stanzaliving.core.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class PrepaidMeterDailyConsumptionDto implements Serializable {

	private static final long serialVersionUID = 3007039109072326224L;
	private LocalDate readingDate;
	private Month month;
	private int monthValue;
	private int year;
    private ElectricityReadingDto openReading;
    private ElectricityReadingDto closeReading;
    private double unitConsumed;
}
