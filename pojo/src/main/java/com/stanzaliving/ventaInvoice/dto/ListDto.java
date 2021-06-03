package com.stanzaliving.ventaInvoice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ListDto {
    private String referenceId;
    private String invoiceId;
    private String creditId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date issuedate;
    private String documentId;
    private String type;
    private String category;
    private HashMap<String,String> duration;
    private int amount;
    private HashMap<String,String> bill_to;
    private String residence;


}
