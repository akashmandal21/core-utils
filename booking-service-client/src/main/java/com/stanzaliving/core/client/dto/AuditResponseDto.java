package com.stanzaliving.core.client.dto;

import com.stanzaliving.booking.enums.BookingSubStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditResponseDto {

    private String bookingUuid;

    private BookingSubStatus bookingSubStatus;
}
