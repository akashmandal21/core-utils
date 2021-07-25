package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentRequestDto {

    private List<DocumentLineItemDto> documentLineItemDto;

    private String studentId;

    @NotNull(message = "ServiceType is required")
    private String serviceType;

    @NotNull(message = "Provide a reference Type Resident or Deal")
    private ReferenceType referenceType;

    private String referenceId;

    @NotNull(message = "DocumentType is mandatory")
    private String documentType;

    private String invoiceUuid;

    private String generationSource;

    private List<CreditAttributionDto> creditAttribution;

    private LocalDate fromDate;

    private LocalDate toDate;

    private CategoryDto category;

    private SubCategoryDto subCategory;

    @NotNull(message = "Amount Is Required")
    private double amount;

    private String contractId;

    private String remarks;

    @NotNull(message = "State code is mandatory")
    private String stateCode;

    private BillToDto billTo;

    private BillFromDto billFrom;

    private String dealUuid;

    private String dealType;

    private String dealName;
}
