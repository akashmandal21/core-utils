package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComCodeAppliedDigestDto {
    private String booking_uuid;
    private String comCode;
    private String createdAt;
    private String createdBy;
}
