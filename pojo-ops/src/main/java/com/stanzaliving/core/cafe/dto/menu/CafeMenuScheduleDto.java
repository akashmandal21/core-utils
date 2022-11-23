package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.enums.CafeMenuStateAction;
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
public class CafeMenuScheduleDto {
    @NotNull(message = "Empty Slot Id")
    private String slotId;
    @NotNull(message = "Empty Effective Date")
    private LocalDate fromDate;
    private CafeMenuStateAction state;
}
