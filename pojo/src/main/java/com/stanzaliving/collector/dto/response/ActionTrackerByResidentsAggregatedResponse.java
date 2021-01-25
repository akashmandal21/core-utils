package com.stanzaliving.collector.dto.response;

import com.stanzaliving.collector.dto.ActionTrackerByResidentsSummary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ActionTrackerByResidentsAggregatedResponse {
    List<ActionTrackerByResidentsResponseDto> actionTrackerByResidentsResponseDtoList;
    ActionTrackerByResidentsSummary actionTrackerByResidentsSummary;
}
