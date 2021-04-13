package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApartmentResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer apartmentId;
	private String propertyCode;
	private Long societyId;
	private Integer roomCount;
	private String name;
	private String gender;
	private Integer micromarketId;
	private String micromarketName;
	private String pricingPlan;
	private Integer startingPrice;
	private Integer cityId;
	private Integer sortOrder;
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);
}