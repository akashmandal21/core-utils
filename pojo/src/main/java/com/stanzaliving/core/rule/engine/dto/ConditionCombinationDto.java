package com.stanzaliving.core.rule.engine.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 01-May-2020
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConditionCombinationDto extends ConditionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Builder.Default
	private String aggregator = "all";

	@Builder.Default
	private Boolean value = true;

	private List<ConditionCombinationDto> conditions;

}