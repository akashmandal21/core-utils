package com.stanzaliving.core.inventory_transformations.model;

import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "TEMPORARY_INVOICE_AUDIT")
public class TemporaryInvoiceAudit {

	@Id
	@GeneratedValue
	@Column(name = "TEMPORARY_INVOICE_AUDIT_ID")
	private int temporaryInvoiceAuditId;

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

	@OneToMany(mappedBy = "temporaryInvoiceAudit", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<TemporaryInvoiceLineItemAudit> temporaryInvoiceLineItemAudits = new HashSet<>(0);

	@Column(name = "INVOICE_AMOUNT")
	private double invoiceAmount;

	@Column(name = "INVOICE_PAID")
	private double amountPaid;

	@Column(name = "INVOICE_DUE")
	private double amountDue;

	@Column(name = "CREATED")
	private Date created = new Date();

	public int getTemporaryInvoiceAuditId() {
		return temporaryInvoiceAuditId;
	}

	public void setTemporaryInvoiceAuditId(int temporaryInvoiceAuditId) {
		this.temporaryInvoiceAuditId = temporaryInvoiceAuditId;
	}

	public Set<TemporaryInvoiceLineItemAudit> getTemporaryInvoiceLineItemAudits() {
		return temporaryInvoiceLineItemAudits;
	}

	public void setTemporaryInvoiceLineItemAudits(Set<TemporaryInvoiceLineItemAudit> temporaryInvoiceLineItemAudits) {
		this.temporaryInvoiceLineItemAudits = temporaryInvoiceLineItemAudits;
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

	public TemporaryInvoiceAudit(TemporaryInvoice invoice) {
		this.executionDate = invoice.getExecutionDate();
		this.dueDate = invoice.getDueDate();
		this.fromDate = invoice.getFromDate();
		this.toDate = invoice.getToDate();
		this.invoiceType = invoice.getInvoiceType();
		this.student = invoice.getStudent();
		this.amountDue = invoice.getAmountDue();
		this.amountPaid = invoice.getAmountPaid();
		this.invoiceAmount = invoice.getInvoiceAmount();
		if (!CollectionUtils.isEmpty(invoice.getInvoiceLineItems())) {
			this.setTemporaryInvoiceLineItemAudits(invoice.getInvoiceLineItems().stream().map(_item -> {
				TemporaryInvoiceLineItemAudit invoiceLineItemAudit = new TemporaryInvoiceLineItemAudit(_item);
				invoiceLineItemAudit.setTemporaryInvoiceAudit(this);
				return invoiceLineItemAudit;
			}).collect(Collectors.toSet()));
		}
	}

}
