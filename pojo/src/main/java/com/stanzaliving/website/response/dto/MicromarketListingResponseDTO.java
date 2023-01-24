package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MicromarketListingResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int micromarketId;
	private String name;
	private String slug;
	private String apartmentMMSlug;
	private int cityId;
	private String cityName;
	private String citySlug;
	private double latitude;
	private double longitude;
	private String phone;
	EnumListing<Status> status;
	@Default
	private boolean enabled = true;

	private List<String> dynamicUrlSlugs;

	private String transformationUuid;
	private Long transformationId;

}
