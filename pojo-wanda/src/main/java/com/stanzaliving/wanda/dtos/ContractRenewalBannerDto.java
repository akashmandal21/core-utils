package com.stanzaliving.wanda.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractRenewalBannerDto {
    private RenewalBannerDynamicConfigurationDto renewalBannerDynamicConfiguration;
    private long contractEndDaysLeft;
    private boolean showBanner;
}
