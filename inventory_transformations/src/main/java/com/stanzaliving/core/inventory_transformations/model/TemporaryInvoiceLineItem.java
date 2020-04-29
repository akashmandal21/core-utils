package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "TEMPORARY_INVOICE_LINE_ITEM")
public class TemporaryInvoiceLineItem {

	@Id
	@GeneratedValue
	@Column(name = "TEMPORARY_INVOICE_LINE_ITEM_ID")
	private int temporaryInvoiceLineItemId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEMPORARY_INVOICE_ID")
	private TemporaryInvoice temporaryInvoice;

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

	public TemporaryInvoice getTemporaryInvoice() {
		return temporaryInvoice;
	}

	public void setTemporaryInvoice(TemporaryInvoice temporaryInvoice) {
		this.temporaryInvoice = temporaryInvoice;
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

}
