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
public class CategoryDto {
    private String categoryName;
    private String invoiceSeries;
    private String rentLedgerName;
    private String generationSource;
    private int vendorSelection;
    private int impactTypes;
    private String categoryUniqueId;
    private String description;
    private String label;
    private double cgst;
    private double igst;
    private double sgst;
    private int hsnCode;
}

