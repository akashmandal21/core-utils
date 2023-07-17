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
public class MicromarketResponseDTO {

	private int micromarketId;
	private String name;
	private int cityId;
	private String cityName;
	private double latitude;
	private double longitude;
	private String slug;
	private String seoTitle;
	private String seoDescription;
	private String phone;
	private String description;
	private String seoFaq;
	private String micromarketDescription;
	private String citySlug;
	EnumListing<Status> status;
	private Long reviewCount;
	private Double rating;
	private Long minPriceValue;
	private List<MicromarketAliasDTO> micromarketAlias;
	private List<AttributeDto> attributeDto;
	
	@Default
	private boolean enabled = true;
	
	@Builder.Default
	private boolean isSelected = false;

	@Default
	private boolean leadQualificationForm=false;
	
	private String apartmentMMSlug;
	private String apartmentCitySlug;
	private Double apartmentRating;
	private Long apartmentReviewCount;
	private Long apartmentMinPriceValue;
	private String apartmentSeoTitle;
	private String apartmentSeoDescription;
	private String apartmentMicromarketDescription;
	private String apartmentMicromarketSeoFaq;

	private boolean comingSoonPg;
	private boolean comingSoonApartment;
	
	private int livePgsCount;
	private int liveApartmentsCount;
}
