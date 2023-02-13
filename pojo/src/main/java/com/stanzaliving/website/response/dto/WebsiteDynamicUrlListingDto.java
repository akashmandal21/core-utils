package com.stanzaliving.website.response.dto;

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

	ResidenceListingPageResponse residenceListingPageResponse;
	ApartmentListingPageResponse apartmentListingPageResponse;

	private Integer cityId;
	private String cityName;

	boolean isApartmentPage;

	private String seoTitle;
	private String seoDescription;
	private String seoContent;
	private String seoFaq;
}
