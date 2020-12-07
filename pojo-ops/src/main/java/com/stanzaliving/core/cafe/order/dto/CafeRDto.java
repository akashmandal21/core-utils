package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.ServingMode;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeRDto {
    private String cafeId;
    private String name;
    private Integer itemCount;
    private List<ServingMode> modes;
    private Map<ServingMode, List<CafeMenuSlotRDto>> modeSlots;
    private boolean currentlyActive;

}
