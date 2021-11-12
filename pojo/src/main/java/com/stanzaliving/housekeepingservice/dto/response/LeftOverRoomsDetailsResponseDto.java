package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 08-Nov-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LeftOverRoomsDetailsResponseDto {
    private String residenceUuid;
    private List<HkBeatPlanRoomDetailsResponseDto> areaTags;
}
