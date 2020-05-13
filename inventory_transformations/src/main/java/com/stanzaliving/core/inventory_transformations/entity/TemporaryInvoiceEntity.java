package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "TEMPORARY_INVOICE")
public class TemporaryInvoiceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEMPORARY_INVOICE_ID", insertable = false, nullable = false)
	@JsonProperty("temporary_invoice_id")
    private Integer temporaryInvoiceId;

    @Column(name = "INVOICE_DUE")
	@JsonProperty("invoice_due")
    private Double invoiceDue;

    @Column(name = "INVOICE_PAID")
	@JsonProperty("invoice_paid")
    private Double invoicePaid;

    @Column(name = "CREATED")
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "DUE_DATE")
	@JsonProperty("due_date")
    private Timestamp dueDate;

    @Column(name = "EXECUTION_DATE")
	@JsonProperty("execution_date")
    private Timestamp executionDate;

    @Column(name = "FROM_DATE")
	@JsonProperty("from_date")
    private Timestamp fromDate;

    @Column(name = "INVOICE_AMOUNT")
	@JsonProperty("invoice_amount")
    private Double invoiceAmount;

    @Column(name = "INVOICE_TYPE")
	@JsonProperty("invoice_type")
    private Integer invoiceType;

    @Column(name = "TO_DATE")
	@JsonProperty("to_date")
    private Timestamp toDate;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "TEMPORARY_STUDENT_ID")
	@JsonProperty("temporary_student_id")
    private Integer temporaryStudentId;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}