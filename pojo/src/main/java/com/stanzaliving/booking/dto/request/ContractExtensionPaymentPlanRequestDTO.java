package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContractExtensionPaymentPlanRequestDTO implements Serializable {

    @NotNull(message = "commercialCardRequestDto cannot be null")
    @Valid
    private CommercialCardRequestDto commercialCardRequestDto;

    @NotNull(message = "bookingDetailsRequestDto cannot be null")
    @Valid
    private BookingDetailsRequestDto bookingDetailsRequestDto;

    @NotNull(message = "bookingCommercialsRequestDto cannot be null")
    @Valid
    private BookingCommercialsRequestDto bookingCommercialsRequestDto;

    private DiscountRequestDto discount;

    @Builder.Default
    private Boolean isWpBooking = false;

    @Builder.Default
    private Boolean savePaymentPlan = false;

    @Builder.Default
    private Boolean modifyContract = false;

    @NotNull(message = "MISSING_DATE_OF_EXTENSION")
    private Date dateOfExtension;

    private Date newLockInEndDate;
}
