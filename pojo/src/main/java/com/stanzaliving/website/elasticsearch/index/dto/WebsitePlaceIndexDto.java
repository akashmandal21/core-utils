package com.stanzaliving.website.elasticsearch.index.dto;

import java.io.Serializable;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WebsitePlaceIndexDto extends AbstractSearchIndexDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String place;
	
	private Integer placeId;
	
	private String placeSlug;
	
	private String placeType;
	
	private Integer placeTypeId;

	private Integer sequenceId;
	
	private Integer cityId;
	
	private String city;
	
	private String citySlug;
	
	private Integer micromarketId;
	
	private String micromarket;

	private String micromarketSlug;
	
	private String gender;
	
	private String transformationUuid;
	
	private double latitude;

	private double longitude;
	
	@Builder.Default
	private String type = "place";
	
	@Builder.Default
	private Boolean isResultInSameCity = false;
	
	@Builder.Default
	private Boolean isExactMatched = false;
	
	private float score;
	
	private String apartmentCitySlug;
	
	private String apartmentMMSlug;

	private boolean isOsmPlace;
}
