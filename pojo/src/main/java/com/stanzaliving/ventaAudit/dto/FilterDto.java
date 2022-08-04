package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FilterDto {
    private List<String> entityUuids;
    private List<String> microMarketUuids;
    private List<String> cityUuids;
    private List<String> societyUuid;
    private List<String> stanzaCityUuid;
    private List<String> stanzaClusterUuid;
    private String searchKey;
    private List<AuditStatus> auditStatus;
    private DurationDto auditedOn;
    private DurationDto auditScheduledOn;
    private Double damageAmountMinPrice;
    private Double damageAmountMaxPrice;
    private List<String> auditorUuid;

}
