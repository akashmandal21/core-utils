package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentFilterDto {
    private List<String> residences;
    private List<String> cities;
    private List<String> micromarket;
    private String documentType;
    private List<String> invoiceCategories;
    private List<String> creditNoteCategories;
    private HashMap<String,String> creationDate;
    private HashMap<String,String>invoiceDuration;
    private HashMap<String,String>resident;
    private List<HashMap<String,String>> contractIds;
}
