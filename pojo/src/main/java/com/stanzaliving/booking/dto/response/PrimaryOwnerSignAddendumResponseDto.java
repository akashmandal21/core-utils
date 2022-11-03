package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrimaryOwnerSignAddendumResponseDto {

    private String primaryOwnerName;

    private String guestName;

    private String guestBookingUuid;

    private Date moveInDate;

    private Boolean withinFiveDays;

    private Date createdAt;

    private String addendumUrl;
}
