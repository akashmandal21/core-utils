
package com.stanzaliving.core.cafe.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.Tags;
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

	@NotNull(message = "Tags selection is mandatory")
	private List<Tags> tags;

	@NotBlank(message = "AddressLine1 filling is mandatory")
	private String addressLine1;

	@NotBlank(message = "AddressLine2 filling is mandatory")
	private String addressLine2;

	@NotBlank(message = "City selection is mandatory")
	private String cityId;

	@NotBlank(message = "State selection is mandatory")
	private String stateId;

	@NotBlank(message = "Country selection is mandatory")
	private String countryId;

	private List<BaseKitchenDto> baseKitchens;
	
	@NotNull(message = "Pincode is mandatory")
	private Integer pincode;

	private List<ResidenceMicromarketDto> residences;

}