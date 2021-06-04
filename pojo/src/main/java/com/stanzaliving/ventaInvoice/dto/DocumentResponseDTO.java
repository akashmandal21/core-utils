package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.invoice.enums.Category;
import com.stanzaliving.ventaInvoice.enums.DocumentType;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import com.stanzaliving.ventaInvoice.enums.Split;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentResponseDTO {

    private String stateCode;

    private String rentLedgerNarration;

    private String stanzaDocumentId;

    private String residentId;

    private ReferenceType referenceType;

    private DocumentType documentType;

    private String invoiceSelector;

    private Split split;

    private CreditAttributionDto creditAttribution;

    private ContractDto contract;

    private Category category;

    private SubCategoryDto subCategory;

    private InvoiceDurationDto invoiceDuration;

    private double invoiceAmount;

    private String remarks;

    private BillToDto billTo;

    private CityDto city;

    private ResidenceDto residence;

    private MicroMarketDto microMarket;
}
