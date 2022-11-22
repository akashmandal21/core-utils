package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto;
import com.stanzaliving.booking.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingEvent implements Serializable {

    private String bookingUuid;
    private BookingStatus bookingStatus;
    private BookingSubStatus bookingSubStatus;
    private BookingResidenceType bookingResidenceType;
    private BookingType bookingType;
    private BookingSubType bookingSubType;
    private String userUuid;
    private String contractDuration;
    private Date contractStartDate;
    private Date contractEndDate;
    private String leadUUid;
    private String roomUuid;
    private String roomNumber;
    private String inventoryUuid;
    private int occupancy;
    private String packageServiceUuid;
    private String commercialCardUuid;
    private String auditUuid;
    private String residentId;
    private String residenceUuid;
    private BookingEventEnum bookingEvent;
    private PaymentTerm paymentTerm;
    private boolean hasMovedIn;
    private List<InventoryResponseOccupancyDto> inventoryOccupancy;
    private Map<String,String> metaData;
    private LocalDate moveOutDate;
    private String userName;
    private String email;
    private String mobile;
    private Integer cityId;
    private String cityUuid;
    private boolean agreementSent;
    private Date expectedMoveInDate;
    private Date expectedMoveOutDate;
    private Date createdAt;
    private Integer tokenAmount;
    private Date moveInDate;
    private Date exitCreatedAt;
    private Date selectedMoveOutDate;
    private String exitReason;
    @Builder.Default
    private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;

}