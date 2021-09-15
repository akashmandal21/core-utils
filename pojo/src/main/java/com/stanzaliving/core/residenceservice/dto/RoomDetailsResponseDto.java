package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetailsResponseDto {

    private String roomUUID;

    private String roomNumber;

    private String floor;

    private Boolean isRoomConvertible;

    private RoomStatus status;

    private String residenceUUID;

    private boolean sellIndividualBeds;

    private String roomConversionCharges;

    private String oldRoomNumber;

    private List<AttributesResponseDto> attributes;

    private List<AttributesResponseDto> consumables;
}

