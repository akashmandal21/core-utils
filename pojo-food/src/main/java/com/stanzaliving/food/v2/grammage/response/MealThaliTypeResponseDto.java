package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.food.v2.common.constants.ThaliType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 04-May-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealThaliTypeResponseDto<T> extends DraftResponseDto<T> {

	private KeyValuePairDto meal;

	private EnumListing<ThaliType> thaliType;

}
