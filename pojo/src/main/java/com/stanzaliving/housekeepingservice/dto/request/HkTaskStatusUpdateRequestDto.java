package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

/**
 * @author Vikas S T
 * @date 28-Jan-22
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkTaskStatusUpdateRequestDto {
    private String taskUuid;
    private String taskStatusUuid;
    private SigmaUpdateTaskStatusReason sigmaUpdateTaskStatusReason;
}
