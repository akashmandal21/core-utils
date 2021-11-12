package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 22-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GarbageCollectionResponseDto {
    private String residenceName;
    private String residenceUuid;
    private boolean collectGarbage;
    private LocalTime duration;
}
