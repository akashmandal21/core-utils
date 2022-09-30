package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuickCardFilterStatusDto {

    @Builder.Default
    private boolean dueToday = false;

    @Builder.Default
    private boolean escalated = false;

    @Builder.Default
    private boolean withinSla = false;

    @Builder.Default
    private boolean outsideSla = false;

    @Builder.Default
    private boolean todayTasks = false;

    @Builder.Default
    private boolean satisfied = false;

    @Builder.Default
    private boolean unSatisfied = false;

    @Builder.Default
    private boolean notReceived = false;
}
