package com.stanzaliving.website.response.dto;

import java.util.HashSet;
import java.util.Set;

import com.stanzaliving.core.enums.PropertyEntityType;

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
public class WebsiteFlatUrlResponseDTO {

	private int flatUrlId;
	private String url;
	private String name;
	private String description;
	private String seoTitle;
	private String seoDescription;
	private Double rating;
	private String reviewCount;
	private String minPriceValue;

	@Builder.Default
	private int sequenceId = 0;

	@Builder.Default
	private Boolean isActive = true;

	@Builder.Default
	private Set<Integer> placeIds = new HashSet<>();

	@Builder.Default
	private Set<String> placeCitySlugs = new HashSet<>();
	
	private Integer roomCount;
	private PropertyEntityType flatUrlType;
}