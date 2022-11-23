package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.commercialcard.enums.CommercialCardBooking;
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommercialCardBookingDto {
    private String bookingUuid;

    private CommercialCardBooking bookingStatus;

    private String commercialCardUuid;

    private CommercialCardStatus cardStatus;

}