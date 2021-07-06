package com.stanzaliving.core.residenceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
}