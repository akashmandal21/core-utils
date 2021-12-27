package com.stanzaliving.core.ventaaggregationservice.dto;

import com.stanzaliving.booking.dto.BookingTag;
import com.stanzaliving.booking.dto.EligibleStatusMappingDto;
import com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto;
import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingAggregationDto {

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
    private String packageServiceName;
    private String packageServiceUuid;
    private Integer occupancy;
    private String occupancyName;
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
    private String city;
    private String microMarket;
    private String createdBy;
    private String updatedBy;
    private Date lockinStartDate;
    private Date lockinEndDate;
    private String lockinDuration;
    private String contractDuration;
    private String colorCode;
    private List<BookingTag> bookingTags;
    private Integer tokenAmount;
    private List<EligibleStatusMappingDto> eligibleStatusMapping;
    private String cityUuid;
    private String microMarketUuid;
    private PaymentTerm paymentTerm;
    private boolean isRetentionBooking = false;
    private boolean noLockInSuitsBooking = false;
    private Date moveInDate;
    private Date maxMoveInDate;
    private Date needsAttentionStartTime;
    private Date needsAttentionEndTime;
    private double pendingAmount;
    private String paymentMode;
    private String bookingAgreementUrl;
    private String bookingSubType;
    private boolean exceptionOnboarding;
    private boolean allowExceptionalOnboarding;
    private List<InventoryResponseOccupancyDto> inventoryOccupancy;
    private Double totalLedgerBalance;
    private String ledgerStatus;
    private String ledgerStatusColorCode;
    private BookingResidenceType bookingResidenceType;
    private Set<String> roomNumberList;
    private Map<String, Integer> roomBedCountMap;
    private String ledgerStatusBackgroundColour;
    private String bookingStatusBackgroundColour;
    private String bhkType;
    private boolean allRoomsSelected;
    private List<InventoryResponseOccupancyDto> inventoryOccupancyResponse;
    private Date exitDate;
    private boolean isInventorySelected;
    private String movedInStatusTextColourCode;
    private String movedInStatusBackgroundColour;
    private String movedInStatus;
    private Double securityDeposit;

}
