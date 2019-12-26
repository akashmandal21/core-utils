package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class PropertyNamingDto {

	private String estateName;
	
	private Long estateId;
	
	private String estateCode;
	
	private String propertyName;
	
	private BrandName brandName;
	
	private SubBrandName subBrandName;
	
	private GenderAllowed gender;
	
	private Long micromarketId;
	
	private boolean status;
	
	private Long cityId;
}
