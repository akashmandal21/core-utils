package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.booking.enums.*;
import com.stanzaliving.core.payment.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixBookingDto {

    private BookingStatus bookingStatus;

    private BookingSubStatus bookingSubStatus;

    private BookingResidenceType bookingResidenceType;

    private BookingType bookingType;

    private BookingSubType bookingSubType;

    private String userUuid;

    private String residentId;

    private String contractDuration;

    private Date expectedMoveInDate;

    private Date expectedMoveOutDate;

    private Date moveInDate;

    private Date moveOutDate;

    private Boolean moveIn;

    private Date contractStartDate;

    private Date contractEndDate;

    private Date lockinStartDate;

    private Date lockinEndDate;

    private String lockinDuration;

    private String ventalockinDuration;

    private BookingSource bookingSource;

    private String leadUUid;

    private Date bookingExpirationTime;

    private Integer tokenAmount;

    private PaymentTerm paymentTerm;

    private PaymentMode paymentMode;

    private boolean personalDetailsFilled;

    private boolean agreementSent;
}
