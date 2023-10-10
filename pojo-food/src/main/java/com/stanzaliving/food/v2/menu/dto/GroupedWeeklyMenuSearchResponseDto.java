package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.base.common.dto.PageResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class GroupedWeeklyMenuSearchResponseDto implements Serializable {

    private MenuSearchStatsRDto stats;
    private PageResponse<? extends GroupedWeeklyMenuResponseDto> menuData;
    private SelectedKitchenDto selectedKitchen;
    private String categoryGroupId;
    private String categoryGroupCode;

}
