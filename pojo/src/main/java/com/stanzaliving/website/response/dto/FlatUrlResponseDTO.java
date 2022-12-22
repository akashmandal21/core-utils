package com.stanzaliving.website.response.dto;

import java.util.Date;
import java.util.List;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Gender;

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
public class FlatUrlResponseDTO {
	private int flatUrlId;
	private String url;
	private String name;
	private String description;
	private String seoTitle;
	private String seoDescription;
	private List<FlatUrlPlaceResponseDTO> placeData;
	private boolean isActive;
	private Boolean locationCheck;
	private Boolean isMultiplePlaceActive;
	private Gender gender;
	private Long reviewCount;
	private Double rating;
	private Long minPriceValue;
	private Integer roomCount;
	private EnumListing<PropertyEntityType> flatUrlType;
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;
}
