package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateAuditResponseDto {
    private String auditUuid;
    private  String message;
    private AuditStatus auditStatus;
}