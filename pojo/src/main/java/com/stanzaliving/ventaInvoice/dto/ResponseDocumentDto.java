package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ResponseDocumentDto implements Serializable {
    private LocalDate issueDate;
    private String stanzaDocumentId;
    private String invoiceType;
    private String categoryName;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double totalAmount;
    private String firstName;
    private String lastName;
    private String residentId;
    private String residenceName;
    private String invoiceUuid;
    private String type;
    private String dealType;
    private String dealName;
    private ReferenceType referenceType;
}
