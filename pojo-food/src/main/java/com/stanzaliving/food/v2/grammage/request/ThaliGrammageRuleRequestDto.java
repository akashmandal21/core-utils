package com.stanzaliving.food.v2.grammage.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
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
@AllArgsConstructor
public class ThaliGrammageRuleRequestDto {

	@Valid
	@NotEmpty(message = "Thali Grammages selection is mandatory")
	private List<GrammageMasterThaliRequestDto> thaliGrammages;

	@Valid
	@NotEmpty(message = "Fixed rules selection is mandatory")
	private List<GrammageMasterRuleFixedRequestDto> fixedRules;

	@Valid
	@NotEmpty(message = "Ratio rules selection is mandatory")
	private List<GrammageMasterRuleRatioRequestDto> ratioRules;
}
