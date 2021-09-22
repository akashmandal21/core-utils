package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomNumberListingResponseDto {

    private String roomNumberUuid;
    private String roomNumber;
    private String floor;
    private String occupancy;

    private Double startingPrice;
    private boolean isConverted;
    private String convertedOccupancy;

    private float availableBeds = 0.0F;
    private float occupiedBeds = 0.0F;
    private float deadBeds = 0.0F;
    private float totalBeds = 0.0F;
    private float blockedBeds = 0.0F;
    private RoomStatus roomStatus;

    RoomPricingResponseDto roomPricing;

    private String residenceUuid;
    private String bhkType;
    private String residenceName;
    List<AttributesResponseDto> attributesResponseDto;

}
