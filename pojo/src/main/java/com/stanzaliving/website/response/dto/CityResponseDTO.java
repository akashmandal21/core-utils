package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.website.enums.Status;
import com.stanzaliving.website.request.dto.AttributeDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CityResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cityId;
	private String name;
	private String code;
	private String iconImageUrl;
	private String seoTitle;
	private String seoDescription;
	private int websiteDisplayOrder;
	private double latitude;
	private double longitude;
	private boolean enabled;
	private String slug;
	private String cityResidenceTypeText;
	private String phone;
	private String description;
	private String seoFaq;
	private String imageAltTag;
	private String iconImageUrlAltTag;
	private String cityImgUrl;
	EnumListing<Status> status;
	private Long reviewCount;
	private Double rating;
	private Long minPriceValue;
	private Boolean whatsappChatFlag;
	private String cityDescription;
	
	private boolean comingSoonPg;
	private boolean comingSoonApartment;
	
	private int livePgsCount;
	private int liveApartmentsCount;
	
	private List<AttributeDto> attributeDto;
    @Builder.Default
	private boolean isSelected = false;
	
	private String apartmentCitySlug;
	private Double apartmentRating;
	private Long apartmentReviewCount;
	private Long apartmentMinPriceValue;
	private String apartmentSeoTitle;
	private String apartmentSeoDescription;
	private String apartmentCityDescription;
	private String apartmentSeoFaq;
	
	//place specific data fields-
	private String place;
	private Integer placeId;
	private String placeSlug;
	private String placeType;
	private Integer placeTypeId;
	private String city;
	private String citySlug;
	private String transformationUuid;

}
