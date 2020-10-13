package com.stanzaliving.core.cafe.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.CafeType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMasterResponseDto extends AbstractDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cafeName;

	private CafeType cafeType;

	private String cafeTypeName;

	private String addressLine1;

	private String addressLine2;

	private String cityId;

	private String cityName;

	private String stateId;

	private String stateName;

	private String countryId;

	private String countryName;

	private String baseKitchenId;

	private String baseKitchenName;

	private Integer pincode;

	private List<ResidenceMicromarketDto> residences;

}