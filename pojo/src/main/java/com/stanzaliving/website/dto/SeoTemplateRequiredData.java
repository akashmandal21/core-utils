package com.stanzaliving.website.dto;

import com.stanzaliving.website.response.dto.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeoTemplateRequiredData implements Serializable {

    private static final long serialVersionUID = 1L;

    private CityListingResponseDTO cityDto;

    private String urlContainedAllMmNames;
    private MicromarketListingResponseDTO micromarketDto;
    private List<MicromarketListingResponseDTO> nearByMicromarketDtos;

    private List<WebsiteNeighbourhoodDto> neighbourhoodDtos;

    private String slPlaceName;
    private String nameUrlSlug;

    private String filteredSeoTitleCommonTemplate;
    private String filteredSeoDescriptionCommonTemplate;
    private String filteredSeoContentCommonTemplate;
    private String filteredSeoFaqCommonTemplate;

    @Builder.Default
    private String filteredSeoTitleChunks = "";

    @Builder.Default
    private String filteredSeoDescriptionChunks = "";

    @Builder.Default
    private String filteredSeoContentChunks = "";

    @Builder.Default
    private String filteredSeoFaqChunks = "";
}
