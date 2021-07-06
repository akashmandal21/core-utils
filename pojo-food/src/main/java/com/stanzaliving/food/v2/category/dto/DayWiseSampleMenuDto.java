package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.food.dto.MenuItemDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class DayWiseSampleMenuDto implements Serializable {
    private DayOfWeek dayOfWeek;
    private List<MenuItemDto> menuItems;
    private Double cogs;
    private Double vegCogs;
    private Double nonVegcogs;
    private Double weight;
    private Double expectedWeight;
    private boolean isEnabled;
}
