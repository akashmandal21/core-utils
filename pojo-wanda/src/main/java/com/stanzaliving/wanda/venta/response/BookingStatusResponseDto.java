package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.enums.AlfredStep;
import com.stanzaliving.wanda.venta.enums.BookingSource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class BookingStatusResponseDto {
    private String houseName;
    private String bookingUuid;
    private String bookingStatus;
    private boolean hasMovedIn;
    private AlfredStep alfredStep;
	@Builder.Default
	private Boolean agreementSent = false;
	private String studentId;
	private Boolean adhaarVerifiedStatus;
    private String adhaarRejectedReason;
    private Boolean panVerifiedStatus;
    private String panRejectedReason;
    private Boolean otherIdVerifiedStatus;
    private String otherIdRejectedReason;
    private Boolean policeVerificationStatus;
    private String policeVerificationRejectedReason;
    private Integer residenceId;
    private BookingSource bookingSource;
    private String bookingSubStatus;
    private String androidVersion;
    private String appleVersion;
    private boolean wp;
}
