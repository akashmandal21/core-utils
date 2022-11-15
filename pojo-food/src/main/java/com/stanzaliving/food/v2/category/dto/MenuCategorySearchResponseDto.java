package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.core.base.common.dto.ListingCountDto;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.food.v2.menu.dto.SelectedKitchenDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategorySearchResponseDto implements Serializable {
    private List<ListingCountDto> stats;
    private PageResponse<MenuCategoryDetailDto> categoryData;
    private SelectedKitchenDto selectedKitchen;
}
