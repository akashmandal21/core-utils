package com.stanzaliving.booking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.booking.dto.response.BookingCommercialCardDto;
import com.stanzaliving.booking.dto.response.BookingPackageServiceDto;
import com.stanzaliving.booking.dto.response.InventoryRequestOccupancyDto;
import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.booking.enums.BookingSource;
import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.booking.enums.BookingType;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)    //  ignore all null fields
public class BookingRequestPayloadDto {

    private BookingType bookingType;

    private BookingSubType bookingSubType;

    private String bookingId;

    private BookingResidenceType bookingResidenceType;

    private String userUuid;

    private BookingSource bookingSource;

    private String leadUUid;

    private double discountAmount;

    private double totalAmount;

    private double upsellAmount;

    private double cityHeadBuffer;

    private BookingDurationDto bookingDuration;

    private InventoryRequestOccupancyDto inventoryOccupancyDetails;

    private BookingCommercialCardDto bookingCommercialCard;

    private BookingPackageServiceDto bookingPackageService;

    private DiscountRequestDto discount;

    private List<InventoryRequestOccupancyDto> managedApartmentsOccupancyDetails;

}
