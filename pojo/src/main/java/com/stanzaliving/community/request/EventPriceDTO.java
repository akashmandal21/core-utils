package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventPriceDTO {

    private String uuid;
    private Long price;
    private boolean showStrikeThrough;
    private Long strikeThroughPrice;
    private Long gstPercentage;
}
