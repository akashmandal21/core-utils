package com.stanzaliving.core.client.dto;

import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.core.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZHResponseDto {

    private ApprovalStatus approvalStatus;
    private LocalDate contractTerminationDate;
    private String zonalHeadRemark; //todo: add validation
    private String bookingUuid;
    private String bookingStatus;
}
