package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.ventaAudit.enums.AuditAction;
import com.stanzaliving.ventaAudit.enums.DamageAssessed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditLogDto {
    private LocalDate date;
    private AuditAction auditAction;
    private String actionBy;
    private String auditRejectionReason;
    private DamageAssessed damageAssessed;
    private Double damageAmount;
}
