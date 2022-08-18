package com.stanzaliving.website.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WebsiteResidenceResponseDto {
    private String videoLink;

    private String googleMapLink;

    private String virtualTourImage;

    private String residenceUrlLink;


}
