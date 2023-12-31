package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CityListingResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int cityId;
	private String name;
	private String slug;
	private String apartmentCitySlug;
	private String code;
	private String iconImageUrl;
	private int websiteDisplayOrder;
	private double latitude;
	private double longitude;
	private boolean enabled;
	private String phone;
	EnumListing<Status> status;

	private List<String> dynamicUrlSlugs;

	private String transformationUuid;
	private Long transformationId;
}
