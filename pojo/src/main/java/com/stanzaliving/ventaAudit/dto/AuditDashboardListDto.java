package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AuditDashboardListDto {
    private String residentId;
    private String residentName;
    private String entityName;
    private String roomNumber;
    private String auditorName;
    private LocalDate auditedOn;
    private LocalDate auditScheduledOn;
    private Double damageTotalAmount;
    private AuditStatus auditStatus;
    private String bookingUuid;
    private String roomUuid;
    private String uuid;
    private Double maxAuditDamageAmount;
    private Double minAuditDamageAmount;
}
