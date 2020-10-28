package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.enums.CafeMenuCopyOption;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuCopyRequestDto {
    private String slotId;
    private CafeMenuCopyOption from;
    private CafeMenuCopyOption to;
    private LocalDate startDate;
}
