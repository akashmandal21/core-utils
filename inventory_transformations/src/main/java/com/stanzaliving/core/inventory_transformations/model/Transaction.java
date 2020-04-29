package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
	  @NamedQuery(name="findAllTransactionByStudentId",
	              query="SELECT trans FROM Transaction trans join trans.student stu WHERE stu.studentId = :studentId AND trans.bookingId = :bookingId")
	})
@Entity
@Table(name = "TRANSACTION")
public class Transaction {

	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_ID")
	private int transactionId;

	@Column(name = "TRANSACTION_DATE", nullable = false)
	private Date transactionDate = new Date();

	@Column(name = "COMPLETION_DATE", nullable = true)
	private Date completionDate;

	@Column(name = "RECEIPT_ID")
	private String receiptId;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "TEMPORARY_STUDENT_ID")
	private TemporaryStudent tempStudent;

	@OneToOne(mappedBy = "transaction", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private PaymonkTransaction paymonkTransaction;

	@OneToOne(mappedBy = "transaction", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private CreditCardTransaction creditCardTransaction;
	
	@OneToOne(mappedBy = "transaction", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, optional = true)
	private RblTransaction rblTransaction;
	
	@Column(name = "GATEWAY_TRANSACTION_ID")
	private String gatewayTransactionId;

	@Column(name = "AMOUNT")
	private double amount;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PAYMENT_MODE_ID")
	private PaymentMode paymentMode;

	@OneToMany(mappedBy = "transaction", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<InvoiceTransaction> invoiceTransactions = new HashSet<>(0);

	@Column(name = "STATUS")
	private String status;

	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="TRANSACTION_TYPE")
	private String transactionType="BOOKING";

	@Column(name="PAYMENT_TRANSACTION_ID")
	private Long paymentTransactionId;
	
	@Column(name="PARENT_COMPANY")
	private ParentCompany parentCompany = ParentCompany.DTWELVE;

	@Column(name = "BOOKING_ID")
	private Integer bookingId;
	
	public Long getPaymentTransactionId() {
		return paymentTransactionId;
	}

	public void setPaymentTransactionId(Long paymentTransactionId) {
		this.paymentTransactionId = paymentTransactionId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
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

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public TemporaryStudent getTempStudent() {
		return tempStudent;
	}

	public void setTempStudent(TemporaryStudent tempStudent) {
		this.tempStudent = tempStudent;
	}

	public PaymonkTransaction getPaymonkTransaction() {
		return paymonkTransaction;
	}

	public void setPaymonkTransaction(PaymonkTransaction paymonkTransaction) {
		this.paymonkTransaction = paymonkTransaction;
	}
	
	public CreditCardTransaction getCreditCardTransaction() {
		return creditCardTransaction;
	}

	public void setCreditCardTransaction(CreditCardTransaction creditCardTransaction) {
		this.creditCardTransaction = creditCardTransaction;
	}

	public RblTransaction getRblTransaction() {
		return rblTransaction;
	}

	public void setRblTransaction(RblTransaction rblTransaction) {
		this.rblTransaction = rblTransaction;
	}

	public ParentCompany getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(ParentCompany parentCompany) {
		this.parentCompany = parentCompany;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
}
