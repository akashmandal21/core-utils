package com.stanzaliving.core.operations.dto.serviceset.housekeeping;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class HouseKeepingBrandDetailsDto {

	private String componentId;

	private boolean available;

	private LocalTime startTime;

	private LocalTime endTime;

	private List<DayOfWeek> days;
}