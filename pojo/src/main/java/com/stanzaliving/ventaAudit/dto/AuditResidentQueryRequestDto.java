package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.dto.PageAndSortDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AuditResidentQueryRequestDto extends AbstractDto {
    private String searchKeyword;
    private PageAndSortDto pageDto;
}