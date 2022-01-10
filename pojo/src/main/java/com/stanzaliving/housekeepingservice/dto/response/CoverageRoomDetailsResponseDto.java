package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 07-Jan-22
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CoverageRoomDetailsResponseDto {
    private String roomNumber;
    private String taskStatusName;
    private boolean occupied;
}
