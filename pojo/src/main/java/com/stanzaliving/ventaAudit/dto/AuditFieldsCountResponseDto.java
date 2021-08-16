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
public class AuditFieldsCountResponseDto {
    List<CountAuditorResponseDto> countAuditor;
    List<CountDueDateResponseDto> countDueDate;
    List<CountAuditStatusResponseDto> countAuditStatus;
}
