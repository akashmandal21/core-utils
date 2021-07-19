package com.stanzaliving.booking.dto.request;


import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiscountSplitterRequestDto {

    @NotNull(message = "bookingDetailsRequestDto cannot be null")
    @Valid
    private BookingDetailsRequestDto bookingDetailsRequestDto;

    @NotNull(message = "bookingCommercialsRequestDto cannot be null")
    @Valid
    private BookingCommercialsRequestDto bookingCommercialsRequestDto;

    @NotNull(message = "discountRequestDto cannot be null")
    @Valid
    private DiscountRequestDto discountRequestDto;

    @Min(value = 0, message = "maintenance fee cannot be negative")
    private Double maintenanceFee;

    @Builder.Default
    @NotNull(message = "maintenance fee collection type cannot be null")
    private MaintenanceFeeCollectionType maintenanceFeeCollectionType = MaintenanceFeeCollectionType.MONTHLY;
}
