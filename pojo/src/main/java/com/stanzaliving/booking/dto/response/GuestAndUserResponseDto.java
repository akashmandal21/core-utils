package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestAndUserResponseDto {

    private String guestFirstName;

    private String guestLastName;

    private String userFirstName;

    private String userLastName;

    private String userAddress;

    private Date moveInDate;

    private Map<String, String> onboardSteps;

    private String displayMessage;
}