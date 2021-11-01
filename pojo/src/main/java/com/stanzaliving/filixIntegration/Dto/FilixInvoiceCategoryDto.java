package com.stanzaliving.filixIntegration.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixInvoiceCategoryDto {
    private String categoryName;

    private Integer hsnCode;

    private String invoiceSeries;

    private String generationSource;

    private float igst;

    private float cgst;

    private float sgst;

    private String rentLedgerName;

    private String parentUuid;

    private String callerServiceType;
}
