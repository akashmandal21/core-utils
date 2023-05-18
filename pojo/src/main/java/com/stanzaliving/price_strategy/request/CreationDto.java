package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CreationDto {

    @NotBlank(message = "Name cannot be empty")
    @NotNull(message = "Name can't be null")
    private String name;

    private CommercialCodeType applyTo;

    private List<String> applyToEntities;

    private Date applicabilityFrom;

    private Date applicabilityTo;

    private CommercialCardStatus strategyCardStatus;

    private List<CommercialCardUserType> bookingTypes;

    private List<ConditionsRule> conditionsRules;

    private CommercialActionDto commercialActionDto;

    private List<PaymentActionDto> allowedFrequencies;

    private String bookingSubTypes;

    private String oldPriceStrategyUuid;
}
