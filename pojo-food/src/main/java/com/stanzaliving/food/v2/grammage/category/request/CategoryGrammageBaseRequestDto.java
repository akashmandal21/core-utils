package com.stanzaliving.food.v2.grammage.category.request;

import com.stanzaliving.food.v2.grammage.request.BaseGrammageRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 14-Jun-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryGrammageBaseRequestDto {

	@NotBlank(message = "Menu category selection is mandatory")
	private String menuCategoryVersionId;

	private List<BaseGrammageRequestDto> requestDtos;
}
