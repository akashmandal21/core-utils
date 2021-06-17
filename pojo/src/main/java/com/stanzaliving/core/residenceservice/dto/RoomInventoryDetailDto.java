package com.stanzaliving.core.residenceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomInventoryDetailDto {

    private List<RoomInventoryDto> roomInventoryDtoList;

    private String roomUuid;

    private String residenceName;

    private String roomNumber;

    private int floor;

    private boolean isRoomConvertible;

    private String residenceUUID;
}
