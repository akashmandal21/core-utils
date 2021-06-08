package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDocumentsDTO {
    private String stanzaDocumentId;
    private String residenceId;
}
