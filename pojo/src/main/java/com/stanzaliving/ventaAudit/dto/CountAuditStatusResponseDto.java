package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountAuditStatusResponseDto {
    AuditStatus auditStatus;
    Long count;
}
