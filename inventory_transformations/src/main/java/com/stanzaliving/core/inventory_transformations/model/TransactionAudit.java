package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TRANSACTION_AUDIT")
public class TransactionAudit {
	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_AUDIT_ID")
	private int transactionAuditId;

	@Column(name = "TRANSACTION_DATE", nullable = false)
	private Date transactionDate = new Date();

	@Column(name = "COMPLETION_DATE", nullable = true)
	private Date completionDate;

	@Column(name = "RECEIPT_ID")
	private String receiptId;
	
	@Column(name = "STUDENT_ID")
	private String student;

	@Column(name = "TEMPORARY_STUDENT_ID")
	private String tempStudent;
	
	@Column(name = "GATEWAY_TRANSACTION_ID")
	private String gatewayTransactionId;

	@Column(name = "AMOUNT")
	private double amount;

	@Column(name = "PAYMENT_MODE_ID")
	private String paymentMode;

	@OneToMany(mappedBy = "transaction", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<InvoiceTransaction> invoiceTransactions = new HashSet<>(0);

	@Column(name = "STATUS")
	private String status;

	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="TRANSACTION_TYPE")
	private String transactionType="BOOKING";
	
	@Column(name = "TRANSACTION")
	private String transaction;

	public int getTransactionAuditId() {
		return transactionAuditId;
	}

	public void setTransactionAuditId(int transactionAuditId) {
		this.transactionAuditId = transactionAuditId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public String getGatewayTransactionId() {
		return gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Set<InvoiceTransaction> getInvoiceTransactions() {
		return invoiceTransactions;
	}

	public void setInvoiceTransactions(Set<InvoiceTransaction> invoiceTransactions) {
		this.invoiceTransactions = invoiceTransactions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getTempStudent() {
		return tempStudent;
	}

	public void setTempStudent(String tempStudent) {
		this.tempStudent = tempStudent;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	
}
