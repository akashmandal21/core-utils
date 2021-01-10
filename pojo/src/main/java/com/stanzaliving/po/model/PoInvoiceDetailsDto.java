package com.stanzaliving.po.model;

import com.stanzaliving.po.enums.InvoiceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

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

    private BigDecimal invoiceAmount;

    private String invoiceUrl;

    private String createdAt;

    private BigDecimal amountPaid;

    private List<PoPaymentDetailsDto> poPaymentDetailsDtos;

    private InvoiceStatus invoiceStatus;

    private Double amountPaidToVendor;

}
