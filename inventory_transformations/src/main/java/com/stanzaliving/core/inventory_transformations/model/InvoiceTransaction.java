package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "INVOICE_TRANSACTION")
public class InvoiceTransaction {

	@Id
	@GeneratedValue
	@Column(name = "INVOICE_TRANSACTION_ID")
	private int invoiceTransactionId;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "INVOICE_ID")
	private Invoice invoice;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "TRANSACTION_ID")
	private Transaction transaction;
	
	@Column(name = "AMOUNT_DUE")
	private double amountDue;

	public int getInvoiceTransactionId() {
		return invoiceTransactionId;
	}

	public void setInvoiceTransactionId(int invoiceTransactionId) {
		this.invoiceTransactionId = invoiceTransactionId;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

}
