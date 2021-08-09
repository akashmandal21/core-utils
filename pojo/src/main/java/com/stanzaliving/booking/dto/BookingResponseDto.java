package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.dto.response.BookingCommercialCardDto;
import com.stanzaliving.booking.dto.response.BookingPackageServiceDto;
import com.stanzaliving.booking.dto.response.InventoryResponseOccupancyDto;
import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.booking.enums.BookingSource;
import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingType;
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

    private Date contractStartDate;

    private Date contractEndDate;

    private Date expectedMoveInDate;

    private Date checkInDate;

    private Date checkoutDate;

    private Date LockInDate;

    private BookingType bookingType;

    private BookingStatus bookingStatus;

    private BookingResidenceType bookingResidenceType;

    private String userUuid;

    private BookingSource bookingSource;

    private String commercialCardUuid;

    private String leadUUid;

    private String bookingUuid;

    private InventoryResponseOccupancyDto inventoryOccupancyDetails;

    private BookingCommercialCardDto bookingCommercialCard;

    private BookingPackageServiceDto bookingPackageService;

    private String uuid;

    private Double transactionAmount;

    private Double bookingAmount;
}
