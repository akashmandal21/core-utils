package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "INVOICE")
public class Invoice {

	@Id
	@GeneratedValue
	@Column(name = "INVOICE_ID")
	private int invoiceId;

	@Column(name = "STANZA_INVOICE_ID")
	private String stanzaInvoiceId;
	
	@Column(name = "DATE_CREATED")
	private Date dateCreated = new Date();

	@Column(name = "DATE_PAID")
	private Date datePaid = new Date();
	
	@Column(name = "DUE_DATE")
	private Date dueDate;

	@Column(name = "FROM_DATE")
	private Date fromDate;
	
	@Column(name = "TO_DATE")
	private Date toDate;
	
	@Column(name = "INVOICE_TYPE")
	private InvoiceType invoiceType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;

	@OneToMany(mappedBy="invoice", cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private Set<InvoiceLineItem> invoiceLineItems = new HashSet<>(0);
	
	@OneToMany(mappedBy="invoice", cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private Set<InvoiceTransaction> invoiceTransactions = new HashSet<>(0);
	
	@ElementCollection
    @CollectionTable(name = "INVOICE_PAYMENT_MODE", joinColumns = @JoinColumn(name = "INVOICE_ID"))
    @Column(name = "PAYMENT_MODE")
    private Set<String> paymentModes = new HashSet<>();
	
	@Column(name = "AMOUNT_PAID")
	private double amountPaid;

	@Column(name = "AMOUNT_DUE")
	private double amountDue;

	@Column(name = "INVOICE_AMOUNT")
	private double invoiceAmount;

	@Column(name = "HSN_SAC")
	private String hsnSac;
	
	@Column(name = "STATUS")
	private String status;

	@Column(name = "IS_SENT",columnDefinition = "int default 0")
	private boolean mailSent;
	
	@Column(name="PARENT_COMPANY")
	private ParentCompany parentCompany;

	@Column(name = "BOOKING_ID")
	private Integer bookingId;

	public boolean isMailSent() {
		return mailSent;
	}

	public void setMailSent(boolean mailSent) {
		this.mailSent = mailSent;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getStanzaInvoiceId() {
		return stanzaInvoiceId;
	}

	public void setStanzaInvoiceId(String stanzaInvoiceId) {
		this.stanzaInvoiceId = stanzaInvoiceId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public InvoiceType getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(InvoiceType invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Set<InvoiceLineItem> getInvoiceLineItems() {
		return invoiceLineItems;
	}

	public void setInvoiceLineItems(Set<InvoiceLineItem> invoiceLineItems) {
		this.invoiceLineItems = invoiceLineItems;
	}

	public Set<InvoiceTransaction> getInvoiceTransactions() {
		return invoiceTransactions;
	}

	public void setInvoiceTransactions(Set<InvoiceTransaction> invoiceTransactions) {
		this.invoiceTransactions = invoiceTransactions;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = Math.round(amountPaid * 1D) / 1D;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = Math.round(amountDue * 1D) / 1D;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = Math.round(invoiceAmount * 1D) / 1D;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getHsnSac() {
		return hsnSac;
	}

	public void setHsnSac(String hsnSac) {
		this.hsnSac = hsnSac;
	}

	public Set<String> getPaymentModes() {
		return paymentModes;
	}

	public void setPaymentModes(Set<String> paymentModes) {
		this.paymentModes = paymentModes;
	}

	public Date getDatePaid() {
		return datePaid;
	}

	public void setDatePaid(Date datePaid) {
		this.datePaid = datePaid;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "Invoice{" +
				"invoiceId=" + invoiceId +
				", stanzaInvoiceId='" + stanzaInvoiceId + '\'' +
				", dateCreated=" + dateCreated +
				", datePaid=" + datePaid +
				", dueDate=" + dueDate +
				", fromDate=" + fromDate +
				", toDate=" + toDate +
				", invoiceType=" + invoiceType +
				", student=" + student +
				", invoiceLineItems=" + invoiceLineItems +
				", invoiceTransactions=" + invoiceTransactions +
				", paymentModes=" + paymentModes +
				", amountPaid=" + amountPaid +
				", amountDue=" + amountDue +
				", invoiceAmount=" + invoiceAmount +
				", hsnSac='" + hsnSac + '\'' +
				", status='" + status + '\'' +
				'}';
	}

	public ParentCompany getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(ParentCompany parentCompany) {
		this.parentCompany = parentCompany;
	}
	
}
