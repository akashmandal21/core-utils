package com.stanzaliving.core.phoenix.embeddedInfos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectSchedule {
    Map<Integer,ProjectScheduleStep> projectScheduleSteps;
}
