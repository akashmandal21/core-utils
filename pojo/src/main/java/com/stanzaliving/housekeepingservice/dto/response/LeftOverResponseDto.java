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
public class LeftOverResponseDto {
    private String residenceUuid;
    private String residenceName;
    private String attributeType;
    private Object details;
    private String taskUuid;
}
