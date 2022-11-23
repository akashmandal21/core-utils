package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 21-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class GrammageMasterRuleFixedResponseDto extends CategorySubCategoryResponseDto {

	private boolean quantifiable;

	private Integer value;

	private Set<KeyValuePairDto> applicableMeals;

	private Set<KeyValuePairDto> applicableThalis;

}
