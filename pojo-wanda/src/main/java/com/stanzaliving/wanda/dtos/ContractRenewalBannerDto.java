package com.stanzaliving.wanda.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractRenewalBannerDto {
    public RenewalBannerDynamicConfigurationDto renewalBannerDynamicConfiguration;
    public long contractEndDaysLeft;
    boolean showBanner;
}
