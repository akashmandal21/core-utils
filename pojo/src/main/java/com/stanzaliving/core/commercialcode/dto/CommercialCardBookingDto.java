package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.commercialcard.enums.CommercialCardBooking;
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardBookingDto {

    private Double usageCount;

    private String bookingUuid;

    private String commandCenterUuid;

    private String commercialCardUuid;

    private CommercialCardStatus cardStatus;

    private CommercialCardBooking bookingStatus;

}