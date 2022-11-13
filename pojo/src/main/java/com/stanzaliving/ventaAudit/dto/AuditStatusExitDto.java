package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AuditStatusExitDto {
    private AuditStatus auditStatus;
    private String bookingUuid;
    private String roomUuid;
    private String auditUuid;
}
