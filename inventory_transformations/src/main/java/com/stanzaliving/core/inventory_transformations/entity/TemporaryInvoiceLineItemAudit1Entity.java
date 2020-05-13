package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT1")
@Data
public class TemporaryInvoiceLineItemAudit1Entity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEMPORARY_INVOICE_LINE_ITEM_ID", insertable = false, nullable = false)
	@JsonProperty("temporary_invoice_line_item_id")
    private Integer temporaryInvoiceLineItemId;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
	@JsonProperty("line_item")
    private String lineItem;

    @Column(name = "TEMPORARY_INVOICE_ID")
	@JsonProperty("temporary_invoice_id")
    private Integer temporaryInvoiceId;

    
}