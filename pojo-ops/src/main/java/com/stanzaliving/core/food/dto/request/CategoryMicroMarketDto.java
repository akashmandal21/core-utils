package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

/**
 * @author piyush srivastava
 *
 * @date 15-June-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryMicroMarketDto {
	private String menuCategoryId;

	private Set<String> microMarkets;
}
