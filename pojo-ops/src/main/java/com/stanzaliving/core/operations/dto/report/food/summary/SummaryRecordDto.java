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
public class SummaryRecordDto extends RecordDto{
	int totalCount;
    ExperienceDto experience;
    AdherenceDto processAdherence;
    CostDto costEfficiency;
    AttendanceDto attendance;
    CostAndExperienceRecordDto costAndExperienceRecordDto;
}