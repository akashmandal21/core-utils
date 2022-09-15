package com.stanzaliving.wanda.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RenewalBannerDynamicConfigurationDto {
    private int thresholdDays;
    private int showBannerDays;
    private String amount;
    private int discountPercent;
    private String couponCode;
    private int users;
}
