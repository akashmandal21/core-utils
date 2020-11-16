package com.stanzaliving.core.inventory.dto;

import lombok.*;

import java.util.Collection;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InventoryTOResponse {

    private boolean success;
    private String errorMsg;
    private Collection<InventoryItemQuantityPrice> items;
}
