package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.housekeepingservice.dto.AreaTagsDto;
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
public class HkBeatPlanRoomDetailsResponseDto {
    private AreaTagsDto tag;

    private List<ParticularRoomsResponseDto> rooms;
}
