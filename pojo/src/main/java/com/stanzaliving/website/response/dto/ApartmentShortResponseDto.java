package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentShortResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer apartmentId;
	
	private String propertyCode;
	
	private Long societyId;
	
	private Integer roomCount;
	
	private String apartmentName;
	
	private String apartmentSlug;
	
	private Integer micromarketId;
	
	private String pricingPlan;
	
	private Integer startingPrice;
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>();
}