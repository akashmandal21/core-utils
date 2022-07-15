package com.stanzaliving.wanda.request;

import com.stanzaliving.booking.dto.request.BookingDetailsRequestDto;
import com.stanzaliving.booking.dto.request.DiscountRequestDto;
import com.stanzaliving.booking.dto.response.InventoryRequestOccupancyDto;
import com.stanzaliving.booking.enums.BookingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ModifyContractRequestDto {

    @NotNull(message = "bookingDetailsRequestDto cannot be null")
    @Valid
    private BookingDetailsRequestDto bookingDetailsRequestDto;

    private String commercialCardUuid;

    private String residenceUuid;

    private String inventoryUuid;

    private String roomNumber;

    private String roomUuid;

    private String serviceMixUuid;

    private Boolean isRoomConverted;

    private int oldOccupancy;

    private int newOccupancy;

    private Double monthlyFees;

    private double upsell;

    private DiscountRequestDto discount;

    private BookingType bookingType;

    @Builder.Default
    private Boolean savePaymentPlan = Boolean.FALSE;

    private List<InventoryRequestOccupancyDto> managedApartmentsOccupancyDetails;

    private String modifyContractType;
}

