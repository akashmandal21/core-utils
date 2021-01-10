package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.dto.CompositionRuleDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AddRuleRequestDto extends CompositionRuleDto {

	private static final long serialVersionUID = 6047917581648149316L;

	@NotNull(message = "Category Id is required field")
	private String categoryUuid;

}