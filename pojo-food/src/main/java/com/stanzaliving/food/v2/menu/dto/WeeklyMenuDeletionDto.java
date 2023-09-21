package com.stanzaliving.food.v2.menu.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WeeklyMenuDeletionDto {
    private String groupedWeeklyMenuId;
}
