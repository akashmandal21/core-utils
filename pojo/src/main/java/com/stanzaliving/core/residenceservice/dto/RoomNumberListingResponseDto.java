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

    private float deadBeds = 0.0F;
    private float totalBeds = 0.0F;
    private float blockedBeds = 0.0F;
    private float occupiedBeds = 0.0F;
    private float availableBeds = 0.0F;
    private float softBlockedBeds = 0.0F;

    private boolean isConverted;

    private Date availableFrom;
<<<<<<< Updated upstream
    private String rofrtag;
=======
    private Date rofrAvailableFrom;
>>>>>>> Stashed changes

    private Double startingPrice;
    private Double gstAmountLabel;
    private Double gstPercentageLabel;
    private Double bumpedUpStartingPrice;

    private String floor;
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

    private List<String> inventoryUuidList;
    private List<AttributesResponseDto> attributesResponseDto;
    @Builder.Default
    private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;
}