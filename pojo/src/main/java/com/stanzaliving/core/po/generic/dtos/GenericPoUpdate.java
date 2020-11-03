package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.erp.supplychain.enums.SupplyChainEvents;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GenericPoUpdate {
    private String poUuid;

    private GenericPOTOStatus poStatus;

    private LocalDateTime lastUpdatedAt;

    private Department department;

    private SupplyChainEvents event;
}
