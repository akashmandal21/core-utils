package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuTimeDto {
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean isActive;
}
