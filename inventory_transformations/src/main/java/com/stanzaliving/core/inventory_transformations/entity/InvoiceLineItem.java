package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "INVOICE_LINE_ITEM")
@Entity
public class InvoiceLineItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_LINE_ITEM_ID", insertable = false, nullable = false)
    private Integer invoiceLineItemId;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
    private String lineItem;

    @Column(name = "INVOICE_ID")
    private Integer invoiceId;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    
}