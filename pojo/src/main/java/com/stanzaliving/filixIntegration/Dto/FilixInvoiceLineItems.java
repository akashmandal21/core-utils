package com.stanzaliving.filixIntegration.Dto;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilixInvoiceLineItems {

    private String invoiceUuid;

    private String lineItemDescription;

    private Double lineAmount;

    private String categoryUuid;

    private String subCategoryUuid;

    private String subCategoryName;

    private String categoryName;

    private float cgstAmount;

    private float sgstAmount;

    private float igstAmount;

    private float cgstPercentage;

    private float sgstPercentage;

    private float igstPercentage;

    private String hsnCode;
}
