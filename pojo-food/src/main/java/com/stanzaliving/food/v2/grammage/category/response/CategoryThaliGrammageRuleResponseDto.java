package com.stanzaliving.food.v2.grammage.category.response;

import com.stanzaliving.food.v2.grammage.response.GrammageMasterRuleFixedResponseDto;
import com.stanzaliving.food.v2.grammage.response.GrammageMasterThaliResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 15-Jun-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CategoryThaliGrammageRuleResponseDto {

	private List<GrammageMasterThaliResponseDto> thaliGrammages;

	private List<GrammageMasterRuleFixedResponseDto> fixedRules;

	private List<CategoryGrammageRuleRatioResponseDto> ratioRules;

}
