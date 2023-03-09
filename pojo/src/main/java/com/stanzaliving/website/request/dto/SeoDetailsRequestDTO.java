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
public class SeoDetailsRequestDTO {

	private int residenceId;
	private int cityId;
	private int micromarketId;
	private String slug;
	private Double rating;
	private Long reviewCount;
	private Long minPriceValue;
	private String seoTitle;
	private String seoDescription;
	private String description;
	private String seoFaq;
}
