package com.stanzaliving.invoice.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author dhruv.mathur
 * @date 29/09/21
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceMaxApprovalLevelDto {
    private Department department;

    private Integer maxApprovalLevel;

    private int financeApprovalAt;
}
