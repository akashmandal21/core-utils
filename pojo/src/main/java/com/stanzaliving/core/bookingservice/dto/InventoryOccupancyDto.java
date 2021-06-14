package com.stanzaliving.core.bookingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryOccupancyDto {

    private String referenceUuid;
    private String referenceType;
    private String residenceUuid;
    private String roomUuid;
    private String inventoryUuid;
    private Date startDate;
    private Date endDate;
    private Integer beds;
    private boolean selfConverted;
    private String uuid;
}
