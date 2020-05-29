package com.stanzaliving.collector.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ActionTrackerByResidentsSummary {
    @Builder.Default
    Double totalPending = 0d;
    @Builder.Default
    Integer duesAndNoTaskAssigned = 0;
    @Builder.Default
    Integer todayFollowUp = 0;
}
