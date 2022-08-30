package com.stanzaliving.core.residenceservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomNumberListingAndCountDto implements Serializable {

    private int count;
    private boolean isAllRoomsAvailable;
    private Double bumpUpPricePercentage;
    private Integer recommendedRoomsCount;
    private List<RoomNumberListingResponseDto> roomNumberAttributes;
    private List<ManagedApartmentDetailDto> managedApartmentDetails;

}