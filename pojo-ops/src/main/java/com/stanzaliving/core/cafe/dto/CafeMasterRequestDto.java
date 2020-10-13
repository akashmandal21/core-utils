package com.stanzaliving.core.cafe.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class CafeMasterRequestDto extends AbstractDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Cafe Name is mandatory")
	private String cafeName;

	@NotNull(message = "Cafe Type selection is mandatory")
	private CafeType cafeType;

	@NotBlank(message = "AddressLine1 filling is mandatory")
	private String addressLine1;

	@NotBlank(message = "AddressLine2 filling is mandatory")
	private String addressLine2;

	@NotNull(message = "City selection is mandatory")
	private String cityId;

	@NotNull(message = "Base Kitchen selection is mandatory")
	private String baseKitchenId;

	@NotNull(message = "Pincode is mandatory")
	private Integer pincode;

	private List<ResidenceMicromarketDto> residences;

}