package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectPlanningTaskNotStartedJobDto {

    private Date currentDate;

    private String module;

    private String taskStatusUuid;

    private String reasonUuid;

    private Boolean taskTemplate;
}
