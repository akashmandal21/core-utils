package com.stanzaliving.core.residenceservice.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomNumberListingAndCountDto {

    private int count;
    private boolean isAllRoomsAvailable;
    private List<RoomNumberListingResponseDto> roomNumberAttributes;
    private List<ManagedApartmentDetailDto> managedApartmentDetails;

}