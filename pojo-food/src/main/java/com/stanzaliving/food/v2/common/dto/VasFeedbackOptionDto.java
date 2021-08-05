package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasFeedbackOptionDto extends AbstractDto {

	private static final long serialVersionUID = 5941791513490573903L;
	private String name;
}
