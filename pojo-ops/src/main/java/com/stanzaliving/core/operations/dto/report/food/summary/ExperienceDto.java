package com.stanzaliving.core.operations.dto.report.food.summary;

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
public class ExperienceDto {

	private int unsatisfied;

	private int satisfied;

	private int socialMediaComplaints;

	private int disasterEvents;

	private int shortage;

	private int shortageFilledTimes;

}