package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.food.dto.MenuItemDto;
import java.io.Serializable;
import java.util.List;
import lombok.Builder;
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
public class MenuItemSummaryDto implements Serializable {
    private List<MenuItemDto> menuItemDtoList;
    @Builder.Default
    private String beverageHash = "";
    @Builder.Default
    private boolean defaultBeverageEnabled = false;
}
