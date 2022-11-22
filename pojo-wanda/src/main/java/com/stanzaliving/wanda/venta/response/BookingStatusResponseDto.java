package com.stanzaliving.wanda.venta.response;

import java.io.Serializable;
import java.util.Date;

import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.booking.enums.BookingSubType;
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
public class BookingStatusResponseDto implements Serializable {
	private String houseName;
    private String bookingUuid;
    private String bookingStatus;
    private String bookingStatusDesc;
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
    private String userCategory;
    private String userUuid;
    private boolean wp;
    private String displayMessage;
    private String roomNumber;
    private String cityName;
    private String microMarketName;
    private String mobileNumber;
    private String jsVersion;
    private String residenceUuid;
    private Long bookingId;
    private BookingSubType bookingSubType;
    private Date expectedMoveInDate;
    private RetentionBookingResponseDto retentionBooking;
    private String contractStartDate;
    private boolean interestMenuVisiblity;
    private boolean interestBanner;
    private String propertyCategory;
    private Date moveInDate;
    private String primaryOwnerName;
    private String bookingType;
    private BookingResidenceType bookingResidenceType ;
}
