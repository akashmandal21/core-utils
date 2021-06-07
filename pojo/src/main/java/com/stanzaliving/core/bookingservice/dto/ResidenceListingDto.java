package com.stanzaliving.core.bookingservice.dto;

import lombok.Data;

import java.util.HashMap;

@Data
public class ResidenceListingDto {

    private String residenceUuid;
    private String residenceName;
    private HashMap<String, Long> totalRoomInfo;

}
