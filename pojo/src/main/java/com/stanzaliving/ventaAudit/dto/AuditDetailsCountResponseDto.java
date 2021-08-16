package com.stanzaliving.ventaAudit.dto;

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
public class AuditDetailsCountResponseDto {
//  private DueDates dueDates;
//  private Long count;
  Map<DueDates,Long> dueDateCount;
  Map<String,Long> auditorCount;
  Map<String,Long> auditStatusCount;

  public void setAuditStatusCount(DueDates dueToday, Long count) {
  }
}
