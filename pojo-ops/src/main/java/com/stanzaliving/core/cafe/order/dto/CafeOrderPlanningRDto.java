package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.dto.CafeVasItemDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderPlanningRDto {
    private CafeVasItemDto itemDetails;
    private String itemId;
    private int quantity;
}
