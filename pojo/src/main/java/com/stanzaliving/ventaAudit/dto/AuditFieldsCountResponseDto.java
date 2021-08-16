package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.AuditStatus;
import com.stanzaliving.ventaAudit.enums.DueDates;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditFieldsCountResponseDto {
  Map<DueDates,Long> dueDateCount;
  Map<String,Long> auditorCount;
  Map<AuditStatus,Long> auditStatusCount;

}
