package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class AreaTagDetailsResponseDto {

    private String tagName;

    private List<RoomDetailsResponseDto> rooms;

    private List<CommonAreaResponseDto> commonAreas;
}
