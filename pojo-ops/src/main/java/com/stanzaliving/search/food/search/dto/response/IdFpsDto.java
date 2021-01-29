package com.stanzaliving.search.food.search.dto.response;

import com.stanzaliving.search.food.search.dto.response.menu.fps.FpsDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 26-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IdFpsDto extends FpsDto {
	private String id;
}
