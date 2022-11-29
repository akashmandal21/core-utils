package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CreationDto {

    private String name;
    private CommercialCodeType applyTo;
    private String applyToEntity;
    private Date applicabilityFrom;
    private Date applicabilityTo;
    private CommercialCardUserType bookingType;
    private List<ConditionsRule> conditionsRules;
    private CommercialActionDto commercialActionDto;
    private List<PaymentActionDto> allowedFrequencies;
}
