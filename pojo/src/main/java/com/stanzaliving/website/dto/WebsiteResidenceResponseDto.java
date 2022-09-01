package com.stanzaliving.website.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WebsiteResidenceResponseDto implements Serializable {
    private String videoLink;

    private String googleMapLink;

    private String virtualTourImage;

    private String residenceUrlLink;


}
