package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.VasType;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 28-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterSearchRequestDto {
	private String name;

	private String category;

	private VasType vasType;

	private Boolean dataComplete;
}
