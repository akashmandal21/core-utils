package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuRDto {
    private List<CafeOrderItemRDto> items;
    private List<CafeOrderItemRDto> recommended;
    private List<CafeOrderItemRDto> charges;
}
