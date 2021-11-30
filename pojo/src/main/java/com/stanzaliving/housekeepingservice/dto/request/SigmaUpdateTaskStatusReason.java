package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SigmaUpdateTaskStatusReason {

    private String taskStatusReason;

    private String comment;

    private String taskExecutionUuid;
}
