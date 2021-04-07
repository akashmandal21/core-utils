package com.stanzaliving.core.food.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DayDefaultMenuDto {
    private DayOfWeek day;
    private String selection;
    private boolean isAllowed;
}
