package com.stanzaliving.core.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SortSpecs {

    INVOICE_ID("invoiceId","inv.invoice_code"),
    SUBMITTED_ON("submittedOn","inv.created_at"),
    LAST_UPDATED_ON("lastUpdatedOn","inv.updated_at"),
    INVOICE_NUM("invoiceNumber","inv.vendor_invoice_ref"),
    INVOICE_DATE("invoiceDate","inv.invoice_date"),
    INVOICE_TYPE("invoiceType","inv.invoice_type"),
    INVOICED("invoiced","inv.invoice_amt"),
    PAID("paid","amt_paid"),
    PENDING("pending","pending"),
    DUE_DATE("dueDate","inv.invoice_pay_due_date"),
    INVOICE_STATUS("invoiceStatus","inv.invoice_status"),

    PO_NUMBER("poNumber","po.po_num");

    private String sortSpec;
    private String dbColumn;
}
