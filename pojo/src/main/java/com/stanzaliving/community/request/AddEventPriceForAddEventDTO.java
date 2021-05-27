package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddEventPriceForAddEventDTO {
    private Long price;
    private boolean showStrikeThrough;
    private Long strikeThroughPrice;
    private Long gstPercentage;
    private Boolean pricingApplicable;

}
