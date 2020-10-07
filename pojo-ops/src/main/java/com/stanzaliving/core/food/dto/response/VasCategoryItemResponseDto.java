package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 07-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasCategoryItemResponseDto {

	private String categoryId;

	private String categoryName;

	private List<ItemCostResponseDto> items;

	private Integer itemCount;
}