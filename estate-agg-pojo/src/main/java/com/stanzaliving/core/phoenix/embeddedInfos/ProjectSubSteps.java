package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectSubSteps implements Comparable<ProjectSubSteps> {
    String projectScheduleSubStepUuid;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private Integer subStepNumber;
    private String subStepName;
    private Integer dependentStep;
    private Integer dependentSubStep;
    private Department department;
    private String assignedUser;
    private LocalDate scheduledStartDate;
    private LocalDate scheduledEndDate;
    private LocalDate actualStartDate;
    private LocalDate actualEndDate;
    private Double completionPercent;

    @Override
    public int compareTo(ProjectSubSteps o) {
        return this.subStepNumber.compareTo(o.getSubStepNumber());
    }
}
