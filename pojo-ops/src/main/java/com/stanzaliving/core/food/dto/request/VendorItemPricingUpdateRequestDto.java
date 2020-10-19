package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

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
