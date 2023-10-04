package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.booking.enums.ResidenceAgreementType;
import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RoomNumberListingResponseDto implements Serializable {

    private float deadBeds;
    private float totalBeds;
    private float blockedBeds;
    private float occupiedBeds;
    private float availableBeds;
    private float softBlockedBeds;

    private boolean converted;
    private boolean referralRoom;

    private Date availableFrom;
    private String rofrtag;
    private Date rofrAvailableFrom;

    private Double startingPrice;
    private Double gstAmountLabel;
    private Double gstPercentageLabel;
    private Double bumpedUpStartingPrice;

    private String floor;
    private String gender;
    private String bhkType;
    private String occupancy;
    private String roomNumber;
    private String residenceUuid;
    private String residenceName;
    private String residenceCode;
    private String roomNumberUuid;
    private String convertedOccupancy;

    private RoomStatus roomStatus;
    private RoomPricingResponseDto roomPricing;
    private ResidenceAgreementType residenceAgreementType;

    private List<String> inventoryUuidList;
    private List<AttributesResponseDto> attributesResponseDto;
    private List<AttributesResponseDto> roomAttributesResponseDto;

}