package com.stanzaliving.price_strategy.request;

import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LockInDto {

    private Date moveIn;
    @NotNull(message = "Operator cannot be null")
    private CriteriaCondition operator;
    private String value;
    private String residenceUuid;
    private BookingType bookingUserType;
}
