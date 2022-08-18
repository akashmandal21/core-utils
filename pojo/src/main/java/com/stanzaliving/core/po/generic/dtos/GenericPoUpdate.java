package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.erp.supplychain.enums.SupplyChainEvents;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GenericPoUpdate {
    private String poUuid;

    private String propertyUuid;

    private GenericPOTOStatus poStatus;

    private LocalDateTime lastUpdatedAt;

    private Department department;

    private boolean po;

    @Builder.Default
    private boolean asisPo=false;

    @Builder.Default
    private boolean asisAreaGsriCompleted=false;

    private LocalDate poEndDate;
    private LocalDate poStartDate;

    private String adjustCloseId;

    private String doneBy;

}
