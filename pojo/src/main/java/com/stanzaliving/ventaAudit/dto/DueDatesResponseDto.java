package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaAudit.enums.DueDates;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DueDatesResponseDto {
  private DueDates dueDates;
  private Long count;
}
