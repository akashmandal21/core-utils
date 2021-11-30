package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 09-Nov-21
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GarbageCollectionResidenceDetailsResponseDto {
    private String residenceId;
    private String residenceName;
    private boolean collectGarbage;
    private LocalTime duration;
}
