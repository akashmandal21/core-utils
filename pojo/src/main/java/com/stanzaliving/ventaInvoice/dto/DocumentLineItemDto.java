package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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