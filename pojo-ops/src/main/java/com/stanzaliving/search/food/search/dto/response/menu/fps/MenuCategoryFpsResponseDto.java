package com.stanzaliving.search.food.search.dto.response.menu.fps;

import com.stanzaliving.search.food.search.dto.response.IdFpsDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 29-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryFpsResponseDto {
	private IdFpsDto menuCategory;

	private List<IdFpsDto> residences;
}
