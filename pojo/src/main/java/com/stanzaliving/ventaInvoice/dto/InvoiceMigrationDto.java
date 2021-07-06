package com.stanzaliving.ventaInvoice.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class InvoiceMigrationDto {

    @JsonSetter("INVOICE_ID")
    private Integer invoiceId;

    @JsonSetter("DATE_CREATED")
    private Date createdAt;

    @JsonSetter("INVOICE_AMOUNT")
    private Double totalAmount;

    @JsonSetter("STUDENT_ID")
    private String referenceId;

    @JsonSetter("STANZA_INVOICE_ID")
    private String stanzaDocumentId;

    @JsonSetter("HSN_SAC")
    private String hsnCode;

    @JsonSetter("FROM_DATE")
    private Date fromDate; //Receiving Date Time

    @JsonSetter("To_DATE")
    private Date toDate;  //Receiving Date Time

}
