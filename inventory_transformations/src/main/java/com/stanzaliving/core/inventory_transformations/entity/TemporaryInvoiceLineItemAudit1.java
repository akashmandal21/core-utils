package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT1")
@Entity
public class TemporaryInvoiceLineItemAudit1 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEMPORARY_INVOICE_LINE_ITEM_ID", insertable = false, nullable = false)
    private Integer temporaryInvoiceLineItemId;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
    private String lineItem;

    @Column(name = "TEMPORARY_INVOICE_ID")
    private Integer temporaryInvoiceId;

    
}