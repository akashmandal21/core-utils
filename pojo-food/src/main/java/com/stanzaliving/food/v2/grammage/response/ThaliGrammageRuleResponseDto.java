package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.food.v2.menu.dto.SelectedKitchenDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class ThaliGrammageRuleResponseDto {

	private List<GrammageMasterThaliResponseDto> thaliGrammages;

	private List<GrammageMasterRuleFixedResponseDto> fixedRules;

	private List<GrammageMasterRuleRatioResponseDto> ratioRules;

	private SelectedKitchenDto selectedKitchen;

}
