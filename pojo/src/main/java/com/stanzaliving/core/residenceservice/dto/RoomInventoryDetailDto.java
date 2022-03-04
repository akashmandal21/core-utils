package com.stanzaliving.core.residenceservice.dto;

import java.util.List;

import com.stanzaliving.core.residenceservice.enums.RoomStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomInventoryDetailDto {

    private List<RoomInventoryDto> roomInventoryDtoList;

    private String roomUuid;

    private String residenceName;

    private String roomNumber;

    private String floor;

    private boolean isRoomConvertible;

    private String residenceUUID;

    private int totalOccupancy;

    private int convertedOccupancy;

    private RoomStatus roomStatus;

    private String reason;

    private Integer bhkType;

    private String microMarketName;

    private String microMarketUuid;

    private int availableRoom;

    private String residenceCode;

}
