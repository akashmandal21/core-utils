package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.invoice.enums.Category;
import com.stanzaliving.ventaInvoice.enums.InvoiceType;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import com.stanzaliving.ventaInvoice.enums.Split;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

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

    private InvoiceType invoiceType;

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
