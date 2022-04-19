package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AuditResidentSerachIndexDto extends AbstractSearchIndexDto {
    private String residentId;
    private String residentName;
}