package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveAuditRequestDto {
    @NotBlank(message = "Audit Uuid Is Required")
    private String auditUuid;
    @NotBlank(message = "Auditor Id Is Required")
    private String auditorUuid;

}
