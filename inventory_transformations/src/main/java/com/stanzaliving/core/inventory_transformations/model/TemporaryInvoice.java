package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TEMPORARY_INVOICE")
public class TemporaryInvoice {

	@Id
	@GeneratedValue
	@Access(AccessType.PROPERTY)
	@Column(name = "TEMPORARY_INVOICE_ID")
	private int temporaryInvoiceId;

	@Column(name = "EXECUTION_DATE")
	private Date executionDate = new Date();

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

	@Column(name = "TEMPORARY_STUDENT_ID")
	private Integer temporaryStudentId;

	@OneToMany(mappedBy = "temporaryInvoice", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<TemporaryInvoiceLineItem> invoiceLineItems = new LinkedHashSet<>(0);

	@Column(name = "INVOICE_AMOUNT")
	private double invoiceAmount;

	@Column(name = "INVOICE_PAID")
	private double amountPaid;

	@Column(name = "INVOICE_DUE")
	private double amountDue;

	@Column(name = "CREATED")
	private Date created = new Date();

	@Column(name = "BOOKING_ID")
	private Integer bookingId;

	public int getTemporaryInvoiceId() {
		return temporaryInvoiceId;
	}

	public void setTemporaryInvoiceId(int temporaryInvoiceId) {
		this.temporaryInvoiceId = temporaryInvoiceId;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
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

	public Set<TemporaryInvoiceLineItem> getInvoiceLineItems() {
		return invoiceLineItems;
	}

	public void setInvoiceLineItems(Set<TemporaryInvoiceLineItem> invoiceLineItems) {
		this.invoiceLineItems = invoiceLineItems;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = Math.round(invoiceAmount * 1D) / 1D;
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

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getTemporaryStudentId() {
		return temporaryStudentId;
	}

	public void setTemporaryStudentId(Integer temporaryStudentId) {
		this.temporaryStudentId = temporaryStudentId;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	
}
