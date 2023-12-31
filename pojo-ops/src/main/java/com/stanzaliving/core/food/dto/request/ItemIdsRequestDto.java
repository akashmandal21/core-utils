package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastva@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 23-Oct-2020
 */

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ItemIdsRequestDto {

	@NotEmpty(message = "Item Ids can not be empty")
	private Set<String> itemIds;

}
