package com.stanzaliving.core.residenceservice.dto;

import java.util.List;

import com.stanzaliving.core.residenceservice.enums.RoomStatus;




@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomNumberListingResponseDto {


    RoomPricingResponseDto roomPricing;
    List<AttributesResponseDto> attributesResponseDto;

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

    private String residenceUuid;
    private String bhkType;
    private String residenceName;
    private List<String> inventoryUuidList;
    private String residenceCode;



}
