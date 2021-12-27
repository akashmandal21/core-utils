package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 30-Nov-21
 **/


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CustomCleaningRoomResponseDto {

    private List<AreaTagDetailsResponseDto> areaTags;

    private CustomResidenceDetailsResponseDto residence;
}
