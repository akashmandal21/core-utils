package com.stanzaliving.invoice.dtos;

import java.util.Map;

import com.stanzaliving.invoice.enums.InvoiceSectionEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class InvoiceApprovalDto {

	private boolean approve;
    private String actionReason;
    Map<InvoiceSectionEnum,Boolean> invoiceApprovalMap;
}
