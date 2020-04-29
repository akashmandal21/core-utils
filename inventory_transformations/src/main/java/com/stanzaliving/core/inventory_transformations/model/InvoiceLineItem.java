package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "INVOICE_LINE_ITEM")
public class InvoiceLineItem {
	
	@Id
	@GeneratedValue
	@Column(name = "INVOICE_LINE_ITEM_ID")
	private int invoiceLineItemId;
		
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "INVOICE_ID")
	private Invoice invoice;
	
	@Column(name = "LINE_ITEM")
	private String lineItem;

	@Column(name = "AMOUNT")
	private double amount;

	public int getInvoiceLineItemId() {
		return invoiceLineItemId;
	}

	public void setInvoiceLineItemId(int invoiceLineItemId) {
		this.invoiceLineItemId = invoiceLineItemId;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
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
