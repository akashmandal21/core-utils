package com.stanzaliving.core.residenceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResidenceInfoDto implements Serializable {
    private Double blendedPrice;
    private Double occupancy;
    private Double bedCount;
    private Double averageOccupancyPrice;

    private Integer totalRoom;
    private Integer availableRoom;
    private Integer blockedRoom;
    private Integer deadRoom;


    private Long liveBeds;
    private Long deadBeds;
    private Long blockedBeds;
    private Float occupiedBeds;

}
