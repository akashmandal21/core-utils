package com.stanzaliving.housekeepingservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 25-Nov-21
 **/

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SigmaTaskAssignRequestDto {
    private String taskUuid;
    private String pseudoPersonUuid;
    private String hkBeatPersonUuid;
}
