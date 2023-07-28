package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;

import java.util.Date;

/**
 * @author anudeep.alevoor
 *
 * @date 29-Nov-2021
 *
 **/

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
