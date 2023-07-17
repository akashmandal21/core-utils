package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.ventaInvoice.dto.BillFromDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AuditPdfGenerationDto {
    private BillFromDto billFromDto;
    private BillToDTO billToDto;
    private StayDetailsDto stayDetailsDto;
    private List<PdfDamageSectionDto> damageSectionDtoList;
    private Double amountPayable;
    private String auditUuid;

}
