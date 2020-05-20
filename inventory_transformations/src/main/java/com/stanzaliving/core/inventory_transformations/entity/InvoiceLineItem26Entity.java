package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "INVOICE_LINE_ITEM_26")
public class InvoiceLineItem26Entity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_LINE_ITEM_ID", insertable = false, nullable = false)
	@JsonProperty("INVOICE_LINE_ITEM_ID")
    private Integer invoiceLineItemId;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
	@JsonProperty("LINE_ITEM")
    private String lineItem;

    @Column(name = "INVOICE_ID")
	@JsonProperty("INVOICE_ID")
    private Integer invoiceId;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    
}