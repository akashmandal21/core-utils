package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventPriceResponseDTO {
    private Long id;
    private String uuid;
    private Long price;
    private boolean showStrikeThrough;
    private Long strikeThroughPrice;
    private Boolean pricingApplicable;
    private Long gstPercentage;
}
