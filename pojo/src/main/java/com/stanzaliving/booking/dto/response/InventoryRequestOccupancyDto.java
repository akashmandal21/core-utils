package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryRequestOccupancyDto {

    private String residenceUuid;

    private String roomUuid;

    private String roomNumber;

    private String inventoryUuid;

    private Integer beds;

    private boolean selfConverted;

    private Integer occupancy;

    private Integer oldOccupancy;

}
