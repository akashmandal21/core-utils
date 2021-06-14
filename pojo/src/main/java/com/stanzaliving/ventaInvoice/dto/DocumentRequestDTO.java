package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.InvoiceType;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import com.stanzaliving.ventaInvoice.enums.Split;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentRequestDTO {

    @NotNull(message = "ResidentId is required")
    private String residentId;

    @NotNull(message = "ServiceType is required")
    private String serviceType;


    private ReferenceType referenceType;

    private InvoiceType invoiceType;

    private String invoiceSelector;

    private Split split;

    private CreditAttributionDto creditAttribution;

    private ContractDto contract;

    private CategoryDto category;

    private SubCategoryDto subCategory;

    private InvoiceDurationDto invoiceDuration;

    @NotNull(message = "Amount Is Required")
    private double invoiceAmount;

    @NotBlank(message = "Property Name is mandatory")
    private String remarks;

    private BillToDto billTo;
    private CityDto city;
    private ResidenceDto residence;
    private MicroMarketDto microMarket;
}
