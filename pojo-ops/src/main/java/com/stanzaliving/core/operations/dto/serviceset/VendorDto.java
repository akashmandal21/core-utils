/**
 * 
 */
package com.stanzaliving.core.operations.dto.serviceset;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.operations.enums.VendorType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 22-Jan-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorDto extends AbstractDto {

	@NotBlank(message = "Vendor Name is Mandatory")
	private String vendorName;

	@NotNull(message = "Vendor Type is Mandatory")
	private VendorType vendorType;

	private String vendorCityId;

	private String vendorCityName;
}