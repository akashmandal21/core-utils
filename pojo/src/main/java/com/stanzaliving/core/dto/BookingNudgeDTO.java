package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingNudgeDTO {
    private String bookingUuid;

    private String residentUuid;

    private String residentCode;

    private BookingNudgeMetadataDTO metadata;
}
