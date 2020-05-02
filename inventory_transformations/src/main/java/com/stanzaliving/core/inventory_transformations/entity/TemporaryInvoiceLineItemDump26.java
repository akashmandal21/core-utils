package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Table(name = "TEMPORARY_INVOICE_LINE_ITEM_DUMP_26")
@Entity
public class TemporaryInvoiceLineItemDump26 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEMPORARY_INVOICE_LINE_ITEM_ID", insertable = false, nullable = false)
    private Integer temporaryInvoiceLineItemId;

    @Column(name = "amount")
    private BigDecimal amount = BigDecimal.ZERO;

    @Column(name = "LINE_ITEM")
    private String lineItem;

    @Column(name = "TEMPORARY_INVOICE_ID")
    private Integer temporaryInvoiceId;

    
}