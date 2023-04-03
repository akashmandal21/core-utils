package com.stanzaliving.website.request.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationSeoDetailsRequestDto extends AbstractDto {

    private String slug;
    private String description;
    private String seoTitle;
    private String seoDescription;
    private String seoFaq;
}
