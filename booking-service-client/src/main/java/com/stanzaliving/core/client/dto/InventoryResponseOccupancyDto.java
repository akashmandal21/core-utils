package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponseOccupancyDto {

    private String bookingUuid;

    private String referenceType;

    private String residenceUuid;

    private String roomUuid;

    private String inventoryUuid;

    private Date startDate;

    private Date endDate;

    private Integer beds;

    private boolean selfConverted;
}

