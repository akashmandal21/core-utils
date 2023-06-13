package com.stanzaliving.booking.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiscountStrategyBookingDto {
    private String bookingUuid;

    private String discountStrategyUuid;

}
