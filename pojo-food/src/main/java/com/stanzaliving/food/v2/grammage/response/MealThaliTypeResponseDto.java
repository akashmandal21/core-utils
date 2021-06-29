package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import com.stanzaliving.food.v2.common.constant.ThaliType;
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

	private EnumListing<MealType> mealType;

	private String mealGroupId;

	private EnumListing<ThaliType> thaliType;

}
