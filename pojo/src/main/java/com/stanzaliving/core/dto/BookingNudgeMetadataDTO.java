package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingNudgeMetadataDTO {

    private String bookingUuid;

    private String message;

    private String comment;

    private String deepLink;

}
