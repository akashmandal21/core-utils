package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 16-Sep-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemQuantityRequestDto {
	@NotBlank(message = "Item selected is not valid.")
	private String itemId;

	@NotNull(message = "Item quantity should be greater than 0")
	@Min(value = 0L, message = "Item quantity should be greater than 0")
	private Integer quantity;
}
