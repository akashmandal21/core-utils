package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookingDetailResponseDto {
	private int bookingId;
    private String bookingStatus;
    private String contractStartDate;
    private String contractEndDate;
    private String moveInDate;
    private String contractMonths;
    private String paymentTerm;
    private String bookingSource;
    private String bookingSubStatus;
    private String roomNumber;
    private String userUuid;
    private boolean movedIn;
    private boolean inProgress;
}
