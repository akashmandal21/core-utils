package com.stanzaliving.ledger.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpcomingBookingsDto {

    String bookingUuid;

    String residentId;

    String contractStartDate;

    String contractEndDate;
}