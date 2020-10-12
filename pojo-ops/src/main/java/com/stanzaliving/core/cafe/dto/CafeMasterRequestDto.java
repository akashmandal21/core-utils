package com.stanzaliving.core.cafe.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class CafeMasterRequestDto extends AbstractDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Cafe Name is mandatory")
	private String cafeName;

	@NotBlank(message = "AddressLine1 filling is mandatory")
	private String addressLine1;
	
	@NotBlank(message = "Cafe Type selection is mandatory")
	private com.stanzaliving.core.cafe.enums.CafeType cafeType;

	@NotBlank(message = "AddressLine2 filling is mandatory")
	private String addressLine2;

	@NotNull(message = "City selection is mandatory")
	private String cityId;

	@NotNull(message = "Micromarket selection is mandatory")
	private String micromarketId;
	
	@NotNull(message = "Base Kitchen selection is mandatory")
	private String baseKitchenId;

	@NotBlank(message = "Pincode is mandatory")
	private Integer pincode;
	
	private BaseKitchenResidenceDto baseKitchenResidenceDto;
	
	

}
