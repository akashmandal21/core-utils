package com.stanzaliving.website.request.dto;

import java.util.List;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Gender;
import com.stanzaliving.website.response.dto.FlatUrlPlaceResponseDTO;

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
public class FlatUrlRequestDTO {
	private int flatUrlId;
	private String url;
	private List<FlatUrlPlaceResponseDTO> placeData;
	private String description;
	private String seoFaq;
	private String name;
	private String seoTitle;
	private String seoDescription;
	private Boolean locationCheck;
	private Boolean isMultiplePlaceActive;
	private Gender gender;
	private Long reviewCount;
	private Double rating;
	private Long minPriceValue;
	private Integer roomCount;
	private EnumListing<PropertyEntityType> flatUrlType;
}
