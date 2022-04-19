package com.stanzaliving.core.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.erp.supplychain.enums.SupplyChainEvents;
import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryActionRequestDto {
    private String toUuid;
    private SupplyChainEvents chainEvent;
    private String srcAddressUuid;
    private String doneBy;
    private Date doneAt;
    private String targetAddressUuid;
    private List<InventoryItemQuantityPrice> items;
}
