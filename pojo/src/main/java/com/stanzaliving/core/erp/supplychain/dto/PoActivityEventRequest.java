package com.stanzaliving.core.erp.supplychain.dto;

import com.stanzaliving.core.erp.supplychain.enums.SupplyChainEvents;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoActivityEventRequest {

    private SupplyChainEvents supplyChainEvent;

    private String poUuid;

    private String referencePoNumber;

    private String task;

    private String contextId;

    private String subContextId;

    private String contextName;

    private String contextDesc;

    private String doneBy;

    private Date doneAt;

    private String referenceUrl;

}
