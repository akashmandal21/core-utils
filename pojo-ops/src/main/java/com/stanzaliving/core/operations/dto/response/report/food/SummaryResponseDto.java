package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.response.report.food.summary.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SummaryResponseDto {
    ExperienceResponseDto experience;
    AdherenceResponseDto processAdherence;
    CostResponseDto costEfficiency;
    AttendanceResponseDto attendance;
    List<CostAndExperienceRecordResponseDto> tableData;
}
