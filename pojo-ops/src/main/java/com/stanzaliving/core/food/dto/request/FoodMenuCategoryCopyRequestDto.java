package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 24-May-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryCopyRequestDto {

	@NotBlank(message = "Category Id is mandatory")
	private String categoryId;

	private String categoryName;

	private String cityId;
}