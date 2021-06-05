package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDTO {
    private String stanzaDocumentId;
    private String residentId;
}
