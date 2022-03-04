package com.stanzaliving.core.residenceservice.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.residenceservice.Dto.OccupancyBlendedPriceDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomCardDetailDto implements Serializable {

    Double blendedPrice;
    Integer totalRooms;
    Float totalBeds;
    Integer liveRooms;
    Float liveBeds;
    Integer deadRooms;
    Float deadBeds;
    Integer occupiedRooms;
    Float occupiedBeds;

    Integer blockedRoom;
    Float blockedBeds;
    List<OccupancyBlendedPriceDto> blendedPriceByOccupancy;

}