package com.stanzaliving.search.food.search.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 29-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryAggregateRequestDto extends DateRangeRequestDto {

	@NotBlank(message = "MenuCategory Selection is mandatory")
	private String menuCategoryId;
}
