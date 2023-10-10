package com.stanzaliving.booking.dto.response;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InventoryResponseOccupancyDto {

    private String bookingUuid;

    private String referenceType;

    private String residenceUuid;

    private String roomUuid;

    private String roomNumber;

    private String inventoryUuid;

    private Date startDate;

    private Date endDate;

    private Double beds;

    private Integer occupancy;

    private String occupancyName;

    private boolean selfConverted;

    private List<String> inventoryUuidList;

    private boolean allRoomsSelected;

    private String bhkType;

    private boolean isInventorySelected;

    private Date availableFrom;

}
