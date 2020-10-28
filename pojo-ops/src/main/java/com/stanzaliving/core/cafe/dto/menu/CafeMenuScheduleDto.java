package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.enums.CafeMenuStateAction;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuScheduleDto {
    private String slotId;
    private LocalDate fromDate;
    private CafeMenuStateAction state;
}
