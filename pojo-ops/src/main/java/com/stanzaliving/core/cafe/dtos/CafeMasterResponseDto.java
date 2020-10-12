package com.stanzaliving.food.cafe.dtos;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.food.cafe.enums.CafeType;

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

	private String addressLine1;

	private CafeType cafeType;

	private String addressLine2;

	private Long cityId;
	
	private String cityName;

	private Long micromarketId;
	
	private String micromarketName;

	private Long baseKitchenId;
	
	private String baseKitchenName;
	
	private Integer pincode;
	
	private BaseKitchenResidenceDto baseKitchenResidenceDto;

}
