package com.stanzaliving.food.v2.category.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 * @version 1.0
 *
 * @since 16-June-2021
 */

@Getter
@AllArgsConstructor
public enum MenuCategoryGrammageUpdateAction {
	
	OVERRIDE_EXISTING("Override Existing", 1),
	SKIP("Skip", 2),
	KEEP_EXISTING_OVERRIDES("Keep Existing Overrides", 3);
	
	private String actionName;
	private Integer sequence;

	
}
