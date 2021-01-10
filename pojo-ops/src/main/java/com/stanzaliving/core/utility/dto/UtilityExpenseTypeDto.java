package com.stanzaliving.core.utility.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UtilityExpenseTypeDto extends AbstractDto {

	private static final long serialVersionUID = -6390207925359407259L;

	private String name;
}