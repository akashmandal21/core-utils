package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.erp.supplychain.enums.SupplyChainEvents;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class PoTimelineDto {

    private  String uuid;

    private SupplyChainEvents supplyChainEvent;

    private String poUuid;

    private String poNumber;

    private String contextId;

    private String subContextId;

    private String contextName;

    private String contextDesc;

    private String doneBy;

    private Date doneAt;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

}
