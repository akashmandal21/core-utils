package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.booking.dto.request.ServicePriceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingAggregationEntity {

    private String bookingUuid;

    private String userUuid;

    private String referenceType;

    private String residentName;

    private String residentId;

    private String residentMobile;

    private String residentEmail;

    private String roomUuid;

    private String roomNumber;

    private String bookingStatus;

    private Date bookingCreationTime;

    private Date bookingExpirationTime;

    private Date contractStartDate;

    private Date contractEndDate;

    private String bookingSubStatus;

    private String bookingType;

    private Date expectedMoveInDate;

    private Date checkInDate;

    private Date checkoutDate;

    private String bookingSource;

    private String leadUuid;

    private String residenceName;

    private String residenceUuid;

    private String inventoryUuid;

    private String commercialCardUuid;
    private String packageServiceUuid;

    private Integer occupancy;

    private Double dues;

    private String riskProfile;

    private boolean duesStatus;

    private boolean moveIn;

    private boolean agreementSent;

    private Boolean agreementSigned;

    private Double licenseFee;

    private Double cityHeadBuffer;

    private Double upsell;

    private Double priceBump;

    private ServicePriceDto packagedServicePriceDto;

    private ServicePriceDto foodServicePriceDto;

    private ServicePriceDto vasPriceDto;

    private String city;

    private String microMarket;

    private String bookingCreatedBy;

    private String bookingUpdatedBy;

    private Double securityDeposit;

    private Double maintenanceFee;

    private String maintenanceFeeCollectionType;

    private int startingAdvanceRentalMonths;

    private int lastAdvanceRentalMonths;

    private Double startingAdvanceRentalMonthsAmount;

    private Double lastAdvanceRentalMonthsAmount;

    private Date lockinStartDate;

    private Date lockinEndDate;

    private String lockinDuration;
}