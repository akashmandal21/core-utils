package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT")
@Data
@Entity
public class TemporaryInvoiceLineItemAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT_ID", nullable = false)
    private Integer temporaryInvoiceLineItemAuditId;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
    private String lineItem;

    @Column(name = "TEMPORARY_INVOICE_AUDIT_ID")
    private Integer temporaryInvoiceAuditId;

    
}