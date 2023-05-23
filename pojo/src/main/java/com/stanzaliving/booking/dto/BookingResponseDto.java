package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.dto.response.BookingCommercialCardDto;
import com.stanzaliving.booking.dto.response.BookingPackageServiceDto;
import com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto;
import com.stanzaliving.booking.dto.response.PricingStrategyRulesResponseDto;
import com.stanzaliving.booking.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponseDto {

    private String bookingUuid;

    private String leadUUid;

    private String userUuid;

    private String residentId;

    private BookingStatus bookingStatus;

    private BookingSubStatus bookingSubStatus;

    private BookingType bookingType;

    private BookingResidenceType bookingResidenceType;

    private Date contractStartDate;

    private Date contractEndDate;

    private Date expectedMoveInDate;

    private Date moveInDate;

    private Date moveOutDate;

    private Date LockInDate;

    private BookingSource bookingSource;

    private Double transactionAmount;

    private Double bookingAmount;

    private InventoryResponseOccupancyDto inventoryOccupancyDetails;

    private BookingCommercialCardDto bookingCommercialCard;

    private PricingStrategyRulesResponseDto pricingStrategyRulesResponseDto;

    private BookingPackageServiceDto bookingPackageService;

    private Double pendingAmount;

    private PaymentTerm paymentTerm;

    private Boolean exceptionalOnboarded;

    private String parentBookingId;

    private String bookingTag;

    private BookingSubType bookingSubType;

    private Date createdAt;

    private String residenceUuid;

    private String residenceName;

    private boolean priceStrategy;

    private Boolean moveIn;

    private ResidenceAgreementType residenceAgreementType;

    private double exitProcessingFee;

    private BookingPreference bookingPreference;

    private String primaryBookingUuid;
}
