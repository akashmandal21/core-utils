package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.booking.enums.PaymentPlanType;
import com.stanzaliving.ventaInvoice.enums.InvoiceType;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentRequestDto {

    @NotNull(message = "ServiceType is required")
    private String serviceType;

    private String generationSource;

    @NotNull(message = "DocumentType is mandatory")
    private InvoiceType documentType;

    @NotNull(message = "Provide a Reference Type Resident or Deal")
    private ReferenceType referenceType;

    private String bookingUuid;

    private String invoiceUuid;

    private List<DocumentLineItemDto> documentLineItemDto;

    private List<CreditAttributionDto> creditAttribution;

    private LocalDate fromDate;

    private LocalDate toDate;

    private PaymentPlanType callerServiceCategory;

    private String categoryUuid;

    private String subCategoryUuid;

    @NotNull(message = "Amount Is Required")
    private double amount;

    private String remarks;

    private String residenceUuid;

    private String residentUuid;

    private DealDto dealDto;

    private DealBillToDto dealBillToDto;

    private Map<String, String> callerServiceMetaData;

}
