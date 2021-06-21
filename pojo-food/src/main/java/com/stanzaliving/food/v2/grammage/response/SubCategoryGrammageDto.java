package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.v2.common.constant.ThaliType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.tuple.Triple;

import java.util.Map;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 03-Jun-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoryGrammageDto {

	private String subCategoryId;

	private Boolean additive;

	private Boolean overridable;

	private Map<Triple<MealType, String, ThaliType>, Integer> mealGrammageMap;
}
