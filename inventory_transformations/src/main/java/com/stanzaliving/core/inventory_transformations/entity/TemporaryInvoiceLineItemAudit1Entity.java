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
	@JsonProperty("TEMPORARY_INVOICE_LINE_ITEM_ID")
    private Integer temporaryInvoiceLineItemId;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
	@JsonProperty("LINE_ITEM")
    private String lineItem;

    @Column(name = "TEMPORARY_INVOICE_ID")
	@JsonProperty("TEMPORARY_INVOICE_ID")
    private Integer temporaryInvoiceId;

    
}