package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectScheduleStep  implements Comparable<ProjectScheduleStep> {
    String projectScheduleUuid;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private boolean status=true;
    private Integer stepNumber;
    private String stepName;
    private Integer dependentStep;
    private Integer dependentSubStep;
    private Department department;
    private String assignedUser;
    private LocalDate scheduledStartDate;
    private LocalDate scheduledEndDate;
    private LocalDate actualStartDate;
    private LocalDate actualEndDate;
    private Double completionPercent;
    private Integer numSubStepCompleted;
    private Integer numSubSteps;
    Map<Integer,ProjectSubSteps> projectSubSteps;

    @Override
    public int compareTo(ProjectScheduleStep o) {
        return this.getStepNumber().compareTo(o.getStepNumber());
    }
}
