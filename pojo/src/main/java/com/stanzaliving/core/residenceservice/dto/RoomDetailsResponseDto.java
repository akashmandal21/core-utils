package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class RoomDetailsResponseDto {

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

