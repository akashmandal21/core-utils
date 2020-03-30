package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoInvoiceDetailsDto {

    private String poInvoiceDetailsId;

    private String poDetailsId;

    private String invoiceType;

    private String invoiceNo;

    private String invoiceDate;

    private String feeOrTax;

    private Double invoiceAmount;

    private String invoiceUrl;

    private String createdAt;

    private Double amountPaid;

}
