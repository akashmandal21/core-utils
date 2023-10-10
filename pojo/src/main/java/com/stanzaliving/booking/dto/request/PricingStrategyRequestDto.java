package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.BookingType;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PricingStrategyRequestDto implements Serializable {

    private String residenceUuid;

    private String microMarketUuid;

    private String cityUuid;

    private double lockInDuration;

    private BookingType bookingType;

    private Boolean isEntireFlat = Boolean.FALSE;

    private Boolean isManagedApartment = Boolean.FALSE;

    private Date fromDate;

    private Date toDate;

}
