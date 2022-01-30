package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 30-Jan-22
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CommonAreaLeftOverResponseDto {
    private String commonAreaUuid;
    private String commonAreaName;
    private String taskDuration;
    private HkBeatPlanTaskStatusResponseDto taskStatus;
    private String taskExecutionUuid;
}
