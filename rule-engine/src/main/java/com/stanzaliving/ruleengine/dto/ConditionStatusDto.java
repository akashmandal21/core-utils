package com.stanzaliving.ruleengine.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConditionStatusDto extends ConditionDto {
	private Boolean passed;
}
