package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayloadDto {
    private String title;

    private String imageUrl;

    private String ctaText;

    private String templateLayout;

    private String campaignGroup;

    private String description;

    private String deepLinkUrl;
}
