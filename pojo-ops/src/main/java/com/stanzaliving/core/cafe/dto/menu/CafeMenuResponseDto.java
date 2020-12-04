package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuResponseDto {
    private static final long serialVersionUID = 1L;
    private LocalDate menuDate;
    private boolean active;
    private String uuid;
    private List<CafeMenuItemResponseDto> items;
}
