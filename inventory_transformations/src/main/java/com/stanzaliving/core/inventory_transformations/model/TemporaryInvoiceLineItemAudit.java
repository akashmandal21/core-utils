package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT")
public class TemporaryInvoiceLineItemAudit {

	@Id
	@GeneratedValue
	@Column(name = "TEMPORARY_INVOICE_LINE_ITEM_AUDIT_ID")
	private int temporaryInvoiceLineItemId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEMPORARY_INVOICE_AUDIT_ID")
	private TemporaryInvoiceAudit temporaryInvoiceAudit;

	@Column(name = "LINE_ITEM")
	private String lineItem;

	@Column(name = "AMOUNT")
	private double amount;

	public int getTemporaryInvoiceLineItemId() {
		return temporaryInvoiceLineItemId;
	}

	public void setTemporaryInvoiceLineItemId(int temporaryInvoiceLineItemId) {
		this.temporaryInvoiceLineItemId = temporaryInvoiceLineItemId;
	}

	public TemporaryInvoiceAudit getTemporaryInvoiceAudit() {
		return temporaryInvoiceAudit;
	}

	public void setTemporaryInvoiceAudit(TemporaryInvoiceAudit temporaryInvoiceAudit) {
		this.temporaryInvoiceAudit = temporaryInvoiceAudit;
	}

	public String getLineItem() {
		return lineItem;
	}

	public void setLineItem(String lineItem) {
		this.lineItem = lineItem;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TemporaryInvoiceLineItemAudit(TemporaryInvoiceLineItem lineItem) {
		this.lineItem = lineItem.getLineItem();
		this.amount = lineItem.getAmount();
	}

}
