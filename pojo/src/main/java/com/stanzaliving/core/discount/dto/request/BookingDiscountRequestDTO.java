package com.stanzaliving.core.discount.dto.request;


import com.stanzaliving.booking.dto.request.DiscountRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDiscountRequestDTO {

    private String bookingUuid;

    private DiscountRequestDto discountRequestDto;

    private String description;

    private double calculatedDiscount;
}
