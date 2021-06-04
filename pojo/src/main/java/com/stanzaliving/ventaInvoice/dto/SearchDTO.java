package com.stanzaliving.ventaInvoice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.ventaInvoice.enums.DocumentType;
import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDTO {
    private Integer documentId;
    private String referenceId;
    @JsonFormat(pattern ="yyyy-MM-dd")
    private LocalDate issueDate;
    private Double amount;
    private DocumentType type;
    private BillToDto billTo;
    private CategoryDto category;
    private InvoiceDurationDto duration;
}
