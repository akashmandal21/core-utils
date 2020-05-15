package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 15-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceCategoryDto {
	private String menuCategoryId;

	private String residenceId;
}
