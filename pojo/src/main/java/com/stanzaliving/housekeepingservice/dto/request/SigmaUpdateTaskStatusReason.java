package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SigmaUpdateTaskStatusReason {

    private String taskStatusReason;
    private String taskUuid;
    private String taskExecutionStatusUuid;
    private List<String> taskExecutionUuids;
}
