package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author naveen.kumar
 *
 * @date 22-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryIdNameDto {

	@NotBlank(message = "Category Id is mandatory")
	private String categoryId;

	private String categoryName;

	private String cityId;
}
