package com.stanzaliving.website.response.dto;

import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Status;
import com.stanzaliving.website.request.dto.AttributeDto;
import com.stanzaliving.website.request.dto.MicromarketAliasDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MicromarketCmsResponseDTO {

	private int micromarketId;
	private String name;
	private int cityId;
	private String cityName;
	private String citySlug;
	private String apartmentCitySlug;
	private double latitude;
	private double longitude;
	private String slug;
	private String seoTitle;
	private String seoDescription;
	private String phone;
	private String campaignSlug;
	private String description;
	EnumListing<Status> status;
	private Long reviewCount;
	private Double rating;
	private Long minPriceValue;
	private List<MicromarketAliasDTO> micromarketAlias;
	private List<AttributeDto> attributeDto;
	
	@Default
	private boolean enabled = true;
	
	@Default
	private boolean leadQualificationForm=false;
	
	private String apartmentMMSlug;
	private Double apartmentRating;
	private Long apartmentReviewCount;
	private Long apartmentMinPriceValue;
	private String apartmentSeoTitle;
	private String apartmentSeoDescription;
	private String apartmentMicromarketDescription;
}
