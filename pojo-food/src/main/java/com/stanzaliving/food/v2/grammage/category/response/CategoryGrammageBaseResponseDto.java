package com.stanzaliving.food.v2.grammage.category.response;

import com.stanzaliving.food.v2.grammage.response.GrammageMasterBaseResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
public class CategoryGrammageBaseResponseDto extends GrammageMasterBaseResponseDto {
	private String menuCategoryVersionId;
}
