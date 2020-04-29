package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ACTUAL_REALISATION")
public class ActualRealization {

	@Id
	@GeneratedValue
	@Column(name = "ACTUAL_REALISATION_ID")
	private int actualRealizationId;

	@Column(name = "EXPECTED_REALISATION_ID")
	private int expectedRealizationId;

	@Column(name = "FROM_DATE")
	private Date fromDate;

	@Column(name = "TO_DATE")
	private Date toDate;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "STUDENT_ID")
	private String student;

	@Column(name = "AMOUNT")
	private double amount;

	@Column(name = "CREATED")
	private Date created = new Date();
	
	@Column(name = "INVOICE_ID")
	private int invoiceId;

	public int getExpectedRealizationId() {
		return expectedRealizationId;
	}

	public void setExpectedRealizationId(int expectedRealizationId) {
		this.expectedRealizationId = expectedRealizationId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public int getActualRealizationId() {
		return actualRealizationId;
	}

	public void setActualRealizationId(int actualRealizationId) {
		this.actualRealizationId = actualRealizationId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	

}
