package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 04-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemTagsListRequestDto {

	@NotBlank(message = "Item Id Cannot be blank")
	private String itemId;

	@NotEmpty(message = "Tag Ids Cannot be empty")
	private Set<String> tagIds;

}
