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

    private boolean dueToday;

    private boolean escalated;

    private boolean withinSla;

    private boolean outsideSla;

    private boolean todayTasks;

    private boolean satisfied;

    private boolean unSatisfied;

    private boolean notReceived;
}
