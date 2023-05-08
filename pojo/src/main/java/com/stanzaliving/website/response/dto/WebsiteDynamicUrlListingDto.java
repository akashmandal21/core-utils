package com.stanzaliving.website.response.dto;

import com.stanzaliving.website.dto.WebsiteAppliedFiltersDto;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;
import com.stanzaliving.website.enums.SeoUrlType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebsiteDynamicUrlListingDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private ResidenceListingPageResponse residenceListingPageResponse;
//	private ApartmentListingPageResponse apartmentListingPageResponse;
	private PropertyLocationListingCardsPageResponse propertyLocationListingCardsPageResponse;

	private Integer cityId;
	private String cityName;

	boolean isApartmentPage;

	private String url;
	private String seoTitle;
	private String seoDescription;
	private String seoContent;
	private String seoFaq;

	private WebsiteAppliedFiltersDto parsedFilters;
	private WebsitePlaceIndexDto placeIndexDto;

	private SeoUrlType seoUrlType;
}
