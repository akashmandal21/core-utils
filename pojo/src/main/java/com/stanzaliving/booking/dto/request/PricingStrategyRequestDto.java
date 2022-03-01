package com.stanzaliving.booking.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class PricingStrategyRequestDto implements Serializable {

    private String residenceUuid;

    private String microMarketUuid;

    private String cityUuid;

    private Date moveIn;

    private Date LockedIn;

}
