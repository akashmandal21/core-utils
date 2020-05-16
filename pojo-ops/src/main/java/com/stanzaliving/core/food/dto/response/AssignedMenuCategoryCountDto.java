package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
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
public class AssignedMenuCategoryCountDto {
	private Long notAssignedCategory;

	private Long assignedCategory;
}
