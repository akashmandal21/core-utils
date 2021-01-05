package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.erp.supplychain.enums.SupplyChainEvents;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    protected Date createdAt;

    protected String createdBy;


    protected Date updatedAt;

    protected String updatedBy;

}
