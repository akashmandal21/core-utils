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
	@JsonProperty("invoice_line_item_id")
    private Integer invoiceLineItemId;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
	@JsonProperty("line_item")
    private String lineItem;

    @Column(name = "INVOICE_ID")
	@JsonProperty("invoice_id")
    private Integer invoiceId;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}