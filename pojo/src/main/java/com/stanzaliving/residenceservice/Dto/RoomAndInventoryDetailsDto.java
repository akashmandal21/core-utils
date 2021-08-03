package com.stanzaliving.residenceservice.Dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class RoomAndInventoryDetailsDto {

    float beds;
    int occupancy;
    int oldOccupancy;
    String occupancyName;
}
