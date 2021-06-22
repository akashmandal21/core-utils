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
	@Default
	private boolean enabled = true;
	private String seoTitle;
	private String seoDescription;
	private String phone;
	private String description;
	private String citySlug;
	EnumListing<Status> status;
	private Long reviewCount;
	private Double rating;
	private Long minPriceValue;
	private List<MicromarketAliasDTO> micromarketAlias;
	private List<AttributeDto> attributeDto;
	@Default
	private boolean leadQualificationForm=false;
}
