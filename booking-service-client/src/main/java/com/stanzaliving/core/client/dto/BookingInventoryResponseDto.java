package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingInventoryResponseDto {

    private String referenceUuid;
    private String referenceType;
    private String residenceUuid;
    private String roomNumber;
    private String inventoryUuid;
    private Date startDate;
    private Date endDate;
    private Integer beds;
    private boolean selfConverted;
    private String uuid;
    private Integer occupancy;
    private String roomUuid;
    private String occupancyName;
    private String bhkType;
}
