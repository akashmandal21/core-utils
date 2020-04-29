package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EXPECTED_REALISATION")
public class ExpectedRealization {

	@Id
	@GeneratedValue
	@Column(name = "EXPECTED_REALISATION_ID")
	private int expectedRealizationId;

	@Column(name = "EXECUTION_DATE")
	private Date executionDate = new Date();

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

	@Column(name="TEMPORARY_INVOICE_ID")
	private Integer temporaryInvoiceId;
	
	public int getExpectedRealizationId() {
		return expectedRealizationId;
	}

	public void setExpectedRealizationId(int expectedRealizationId) {
		this.expectedRealizationId = expectedRealizationId;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
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

	public Integer getTemporaryInvoiceId() {
		return temporaryInvoiceId;
	}

	public void setTemporaryInvoiceId(Integer temporaryInvoiceId) {
		this.temporaryInvoiceId = temporaryInvoiceId;
	}

}
