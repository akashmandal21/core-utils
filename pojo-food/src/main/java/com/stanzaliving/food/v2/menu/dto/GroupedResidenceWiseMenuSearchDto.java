package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.food.v2.category.dto.MenuCategoryResidenceRDto;
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
public class GroupedResidenceWiseMenuSearchDto extends GroupedWeeklyMenuResponseDto {

    private MenuCategoryResidenceRDto residence;

}
