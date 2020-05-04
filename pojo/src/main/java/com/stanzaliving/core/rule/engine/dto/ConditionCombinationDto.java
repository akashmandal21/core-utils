package com.stanzaliving.core.rule.engine.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

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