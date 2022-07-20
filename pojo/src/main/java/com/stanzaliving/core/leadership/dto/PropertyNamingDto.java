package com.stanzaliving.core.leadership.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PropertyNamingDto {

	private String uuid;

	@JsonProperty(value = "estateName", required=true)
	private String estateName;

	private String estateUuid;
	
	private Long estateId;
	
	private String estateCode;

	@JsonProperty(value = "propertyName", required=true)
	private String propertyName;

	@JsonProperty(value = "brandName", required=true)
	private BrandName brandName;

	@JsonProperty(value = "subBrandName", required=true)
	private SubBrandName subBrandName;

	@JsonProperty(value = "gender", required=true)
	private GenderAllowed gender;

	private Double totalPremiseArea;

	private Integer numBeds;

	private Integer numRooms;

	private String apartmentFloorNumber;
	
	private Long micromarketId;
	
	private boolean status;
	
	private Long cityId;

	private String propertyUuid;

	private String oldPropName;

	private PropertyEntityType propertyType;

}
