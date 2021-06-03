package com.stanzaliving.ventaInvoice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SearchDto {
    private String documentId;
    private String referenceId;
    private String residentId;
    @JsonFormat(pattern ="yyyy-MM-dd")
    private Date issueDate;
    private BillToDto billTo;
    private InvoiceDurationDto duration;
    private String id;
    private String type;
    private String category;
    private Long amount;
    private String currency;
    private String residence;

}
