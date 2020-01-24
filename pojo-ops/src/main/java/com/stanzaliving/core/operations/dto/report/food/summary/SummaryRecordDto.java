package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.RecordDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SummaryRecordDto extends RecordDto {

	private int totalCount;
	
	private ExperienceDto experience;
	
	private AdherenceDto processAdherence;
	
	private CostDto costEfficiency;
	
	private AttendanceDto attendance;
	
	private CostAndExperienceRecordDto costAndExperienceRecordDto;
	
	private int daysConsidered;
	
}