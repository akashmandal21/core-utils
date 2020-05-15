package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.FoodVendorDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 15-May-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodVendorWithHostelCountDto extends FoodVendorDto {
	private Integer hostelCount;
}
