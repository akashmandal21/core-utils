package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.booking.enums.PaymentFrequency;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommercialCardDto {

    private List<CommercialCardApplicabilityDto> applicabilityDtoList;

    private CommercialCardUserType commercialCardUserType;

    private Double monthlyRent;
    
    private Boolean modifyContractFlow = Boolean.FALSE;

    private String appliedCommercialCard;

    private BookingStatus bookingStatus;

    private BookingSubType bookingSubType;

    private PlatformType platform;

    private PaymentFrequency paymentFrequency;

}
