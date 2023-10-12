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
@NoArgsConstructor
@AllArgsConstructor
public class RoomCardDetailDto implements Serializable {

    Float liveBeds;
    Float deadBeds;
    Float totalBeds;
    Float blockedBeds;
    Float occupiedBeds;

    Integer liveRooms;
    Integer deadRooms;
    Integer totalRooms;
    Integer blockedRoom;
    Integer occupiedRooms;

    Double blendedPrice;
    Double minimumPrice;
    Double maximumPrice;
    Double blendedCityHeadBufferPrice;

    List<OccupancyBlendedPriceDto> blendedPriceByOccupancy;

}