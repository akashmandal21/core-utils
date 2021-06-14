package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class RoomNumberListingResponseDto {

    private String roomNumberUuid;
    private String roomNumber;
    private String floor;
    private String occupancy;

    private Double startingPrice;
    private boolean isConverted;
    private String convertedOccupancy;

    private float availableBeds;
    private float occupiedBeds;
    private float deadBeds;
    private float totalBeds;
    private RoomStatus roomStatus;

}
