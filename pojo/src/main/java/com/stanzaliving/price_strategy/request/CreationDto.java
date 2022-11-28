package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import io.vavr.collection.List;
import lombok.*;

import java.util.Date;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CreationDto {

    private String name;
    private String applyTo;
    private String applyToEntity;
    private Date applicabilityFrom;
    private Date applicabilityTo;
    private CommercialCardUserType bookingType;
    private List<ConditionsRule> conditionsRules;
    private CommercialActionDto commercialActionDto;
    private List<PaymentActionDto> allowedFrequencies;
}
