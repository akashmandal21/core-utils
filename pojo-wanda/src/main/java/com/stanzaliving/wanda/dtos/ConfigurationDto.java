package com.stanzaliving.wanda.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationDto {
    private RenewalBannerDynamicConfigurationDto renewalBannerDynamicConfiguration;
}
