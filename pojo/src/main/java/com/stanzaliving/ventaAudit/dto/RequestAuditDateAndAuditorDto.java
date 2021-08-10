package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestAuditDateAndAuditorDto {
    @NotBlank(message = "Audit Uuid is required")
    private String auditUuid;
    private LocalDate auditedOn;
    private String auditorUuid;
}
