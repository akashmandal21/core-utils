package com.stanzaliving.food.v2.category.dto;


import java.util.List;

import com.stanzaliving.food.v2.category.constant.CategorySearchSortingField;
import com.stanzaliving.food.v2.common.constant.SortingType;

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
public class MenuCategoryVendorAndResidenceWiseDto {
    private List<String> residenceIds;
    private List<String> vendorIds;
    private SortingType sortingType;
    private CategorySearchSortingField sortingField;
}
