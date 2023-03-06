package com.stanzaliving.website.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ApartmentSeoDetailsRequestDTO {

	private int cityId;
	
	private String apartmentCitySlug;
	
	private String apartmentCityDescription;
	
	
	private int micromarketId;
	
	private String apartmentMMSlug;
	
	private String apartmentMicromarketDescription;

	private String apartmentMicromarketSeoFaq;

	private Double apartmentRating;
	
	private Long apartmentReviewCount;
	
	private Long apartmentMinPriceValue;
	
	private String apartmentSeoTitle;

	private String apartmentSeoDescription;

	private String apartmentSeoFaq;
}
