package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.residenceservice.Dto.OccupancyBlendedPriceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

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
    Double minimumPrice;
    Double maximumPrice;
}