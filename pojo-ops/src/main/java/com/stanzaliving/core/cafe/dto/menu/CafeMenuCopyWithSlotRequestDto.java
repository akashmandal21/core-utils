package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuCopyWithSlotRequestDto {
    private String cafeId;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Map<String, List<SlotResidenceDto>> slotData;
}
