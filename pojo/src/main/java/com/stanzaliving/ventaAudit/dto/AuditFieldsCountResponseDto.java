package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditFieldsCountResponseDto {
    Set<CountAuditorResponseDto> countAuditor;
    List<CountDueDateResponseDto> countDueDate;
    List<CountAuditStatusResponseDto> countAuditStatus;
}
