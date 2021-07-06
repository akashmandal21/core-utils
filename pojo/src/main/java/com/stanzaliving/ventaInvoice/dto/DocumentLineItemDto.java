package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentLineItemDto {
    private String lineItemDescription;
    private Double lineItemAmount;
    private float cgstAmount;
    private float sgstAmount;
    private float igstAmount;
    private float cgstPercentage;
    private float sgstPercentage;
    private float igstPercentage;
    private int documentId;

}