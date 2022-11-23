package com.stanzaliving.core.bookingservice.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class InventoryOccupancyDto {

    private String referenceUuid;
    private String referenceType;
    private String residenceUuid;
    private String roomUuid;
    private String inventoryUuid;
    private Date startDate;
    private Date endDate;
    private Double beds;
    private boolean selfConverted;
    private String uuid;
    private Integer occupancy;
    private String occupancyName;
    private String bhkType;
    private String roomNumber;

}
