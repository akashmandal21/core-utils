package com.stanzaliving.core.residenceservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoomNumberListingAndCountDto {

    private int count;
    private List<RoomNumberListingResponseDto> roomNumberAttributes;
}