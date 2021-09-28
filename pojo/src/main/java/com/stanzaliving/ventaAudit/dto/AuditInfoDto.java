package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditInfoDto {
    private String auditOwner;
    private LocalDate auditDate;
    private String entityName;
    private String roomNumber;
    private List<AuditInventoryInfoDto> auditInventoryInfoDtoList;

}
