package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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
public class CafeMenuResponseDto extends AbstractDto {
    private static final long serialVersionUID = 1L;
    private LocalDate menuDate;
    private boolean active;
    private List<CafeMenuItemResponseDto> items;
}
