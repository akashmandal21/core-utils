package com.stanzaliving.residenceservice.Dto;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomAndInventoryDetailsDto {

    float beds;
    int occupancy;
    int oldOccupancy;
    String occupancyName;
    String inventoryUuid;
    String residenceUuid;
}
