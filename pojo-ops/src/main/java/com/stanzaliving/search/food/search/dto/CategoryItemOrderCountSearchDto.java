package com.stanzaliving.search.food.search.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 11-Jan-2020
 */

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CategoryItemOrderCountSearchDto {

	private List<String> itemIds;

	private String menuCategoryId;

	private LocalDate fromDate;

	private LocalDate toDate;
}
