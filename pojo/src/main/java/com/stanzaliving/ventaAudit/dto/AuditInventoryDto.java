package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditInventoryDto {
    private Double quantity;
    private List<String> onboardingImages;
    private List<AuditDetailsDto> auditDetailsDtos;
}
