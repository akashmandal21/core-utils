package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.food.v2.category.dto.MenuCategoryResidenceRDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuWiseMenuSearchRDto extends MenuSearchRDto {
    private List<MenuCategoryResidenceRDto> residences;
}
