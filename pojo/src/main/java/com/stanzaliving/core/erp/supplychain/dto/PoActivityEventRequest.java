package com.stanzaliving.core.erp.supplychain.dto;

import com.stanzaliving.core.erp.supplychain.enums.SupplyChainEvents;
import com.stanzaliving.core.pojo.AttachmentDto;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    private String actionReason;

    private String actionUrl;

    Map<String, List<AttachmentDto>> attachmentDtoList;

    Map<String, Object> additionalData;

}
