package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class LeftOverAreaRoomResponseDto {
    private String areaTagName;
    private String areaTagUuid;
    private List<RoomDetailsLeftOverResponseDto> roomDetails;
    private List<CommonAreaLeftOverResponseDto> commonAreas;

}
