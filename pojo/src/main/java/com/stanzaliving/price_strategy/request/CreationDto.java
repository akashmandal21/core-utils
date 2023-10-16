package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.BookingSubType;
import com.stanzaliving.commercialcard.enums.AMCAmountType;
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import com.stanzaliving.commercialcard.enums.CommercialCodeType;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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

    @NotNull(message = "applyToEntities can't be null")
    @NotEmpty(message = "applyToEntities can't be empty")
    private List<String> applyToEntities;

    private Date applicabilityFrom;

    private Date applicabilityTo;

    private CommercialCardStatus strategyCardStatus;

    @NotNull(message = "booking user type can't be null")
    @NotEmpty(message = "booking user type can't be empty")
    private List<CommercialCardUserType> bookingTypes;

    @NotNull(message = "commercial rules can't be null")
    @NotEmpty(message = "commercial rules can't be empty")
    private List<ConditionsRule> conditionsRules;

    private CommercialActionDto commercialActionDto;

    @NotNull(message = "payment rules can't be null")
    @NotEmpty(message = "payment rules can't be empty")
    private List<PaymentActionDto> allowedFrequencies;

    private String bookingSubTypes;

    private String oldPriceStrategyUuid;
}
