package com.stanzaliving.debezium;

import com.stanzaliving.booking.dto.BookingTag;
import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.core.user.enums.Gender;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingElasticMappingDto {

    private boolean exceptionOnboarding;
    private String bookingStatus;
    private String bookingSubStatus;
    private String bookingUuid;
    private Date bookingCreationTime;
    private Date bookingExpirationTime;
    private Date contractStartDate;
    private Date contractEndDate;
    private Date expectedMoveInDate;
    private Date lockinStartDate;
    private Date lockinEndDate;
    private BookingResidenceType bookingResidenceType;
    private String contractDuration;
    private String bookingType;
    private Date checkInDate;
    private Date checkoutDate;
    private String lockinDuration;
    private String bookingSource;
    private String leadUuid;
    private boolean moveIn;
    private boolean agreementSent;
    private Boolean agreementSigned;
    private String createdBy;
    private String updatedBy;
    private PaymentTerm paymentTerm;
    private Integer tokenAmount;
    private String paymentMode;
    private String bookingSubType;
    private Boolean auditCompleted;
    private List<BookingTag> bookingTags;
    private String parentBookingId;
    private String guestUuid;
    private String ledgerStatus;
    private Double totalLedgerBalance;
    private String userUuid;
    private String residentName;
    private String residentId;
    private String residentMobile;
    private String residentEmail;
    private Gender gender;
    private String collegeName;
    private String degree;
    private String companyName;
    private Integer yearOfStudy;
    private String commercialCardUuid;


}
