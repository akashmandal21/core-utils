package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuCopyRequestDto {
    @NotNull(message = "Empty Slot Id")
    private String slotId;
    @NotNull(message = "Empty Copy Start Date")
    private LocalDate startDate;
}
