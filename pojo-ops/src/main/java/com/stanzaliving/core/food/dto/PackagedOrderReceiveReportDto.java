package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class PackagedOrderReceiveReportDto {

	private LocalDate date;

	private String meal;
	
	private Integer actualContainers;
	
	@Builder.Default
	private Integer expectedContainers=0;

	private Integer actualMeals;

	@Builder.Default
	private Integer expectedMeals=0;
	
	private Integer actualVegContainers;

	@Builder.Default
	private Integer expectedVegContainers=0;

	@Builder.Default
	private Integer actualNonvegContainers=0;

	@Builder.Default
	private Integer expectedNonvegContainers=0;

	@Builder.Default
	private Integer actualNonSLStaffContainers=0;

	@Builder.Default
	private Integer expectedNonSLStaffContainers=0;

	private List<OrderReceiveBasePreferenceDto> basePreferenceDtos;

}
