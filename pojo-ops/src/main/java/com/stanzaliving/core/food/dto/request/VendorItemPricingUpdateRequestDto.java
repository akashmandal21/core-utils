package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.cafe.dto.ItemPricingUpdateRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 19-Oct-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorItemPricingUpdateRequestDto {
	@NotBlank(message = "Vendor Selection is mandatory")
	private String vendorId;

	@NotNull(message = "Atleast one item need to be selected for updation")
	@Valid
	private List<ItemPricingUpdateRequestDto> items;
}
