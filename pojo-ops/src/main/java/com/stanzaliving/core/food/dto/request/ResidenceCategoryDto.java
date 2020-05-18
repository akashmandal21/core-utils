package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;

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

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	@NotBlank(message = "Menu Category Id is mandatory")
	private String menuCategoryId;

}