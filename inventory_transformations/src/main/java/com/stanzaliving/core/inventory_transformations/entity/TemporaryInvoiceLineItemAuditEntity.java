package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT")
@Data
public class TemporaryInvoiceLineItemAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT_ID", nullable = false)
	@JsonProperty("temporary_invoice_line_item_audit_id")
    private Integer temporaryInvoiceLineItemAuditId;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "LINE_ITEM")
	@JsonProperty("line_item")
    private String lineItem;

    @Column(name = "TEMPORARY_INVOICE_AUDIT_ID")
	@JsonProperty("temporary_invoice_audit_id")
    private Integer temporaryInvoiceAuditId;

    
}