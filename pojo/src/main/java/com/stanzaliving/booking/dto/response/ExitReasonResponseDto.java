package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitReasonResponseDto {

    private String reasonUuid;

    private String reason;

    private String bookingStatus;

    private String reasonNotes;
}
