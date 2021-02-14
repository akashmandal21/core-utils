package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 15-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidencePerformanceDto extends PerformanceDto {
	private static final long serialVersionUID = -8975754L;

	private ListingDto residence;

}
