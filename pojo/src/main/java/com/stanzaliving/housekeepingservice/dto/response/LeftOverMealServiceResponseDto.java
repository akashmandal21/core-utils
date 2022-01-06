package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 20-Dec-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LeftOverMealServiceResponseDto {
    private String taskDuration;
    private HkBeatPlanTaskStatusResponseDto taskStatus;
    private String taskExecutionUuid;
    private String mealType;
    private String timing;
}
