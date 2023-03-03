package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Gender;
import lombok.*;

import java.util.Date;
import java.util.List;

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
	private String seoFaq;
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
