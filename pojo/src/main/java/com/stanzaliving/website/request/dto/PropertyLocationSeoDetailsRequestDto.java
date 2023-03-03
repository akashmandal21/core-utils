package com.stanzaliving.website.request.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationSeoDetailsRequestDto {

    private Long locationId;
    private String description;
    private String seoTitle;
    private String seoDescription;
}
