package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.food.dto.response.ItemCategoryCountDto;

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
public class ItemMasterSummaryDto {

	private Integer categoriesCount;

	private List<ItemCategoryCountDto> categoryCountDtos;

	private Integer subCategoriesCount;

	private List<ItemSubCategoryCountDto> subCategoryCountDtos;

	private Integer itemCount;

	private long tagCounts;

}