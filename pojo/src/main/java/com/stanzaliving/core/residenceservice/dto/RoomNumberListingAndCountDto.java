package com.stanzaliving.core.residenceservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomNumberListingAndCountDto {

    private int count;
    private boolean isAllRoomsAvailable;
    private List<RoomNumberListingResponseDto> roomNumberAttributes;
    private List<ManagedApartmentDetailDto> managedApartmentDetails;

}