package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.common.dto.ListingCountDto;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import com.stanzaliving.food.v2.menu.dto.MenuSearchStatsRDto;
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
}
