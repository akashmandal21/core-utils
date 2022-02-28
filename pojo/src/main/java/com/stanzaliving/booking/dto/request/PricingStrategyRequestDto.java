package com.stanzaliving.booking.dto.request;

import javax.validation.Valid;
import java.io.Serializable;

public class PricingStrategyRequestDto implements Serializable {

    private String strategyUuid;

    private String ruleUuid;

    private String status;

    private float discount;

}
