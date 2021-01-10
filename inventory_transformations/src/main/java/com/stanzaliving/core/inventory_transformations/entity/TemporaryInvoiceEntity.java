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
	@JsonProperty("TEMPORARY_INVOICE_ID")
    private Integer temporaryInvoiceId;

    @Column(name = "INVOICE_DUE")
	@JsonProperty("INVOICE_DUE")
    private Double invoiceDue;

    @Column(name = "INVOICE_PAID")
	@JsonProperty("INVOICE_PAID")
    private Double invoicePaid;

    @Column(name = "CREATED")
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "DUE_DATE")
	@JsonProperty("DUE_DATE")
    private Timestamp dueDate;

    @Column(name = "EXECUTION_DATE")
	@JsonProperty("EXECUTION_DATE")
    private Timestamp executionDate;

    @Column(name = "FROM_DATE")
	@JsonProperty("FROM_DATE")
    private Timestamp fromDate;

    @Column(name = "INVOICE_AMOUNT")
	@JsonProperty("INVOICE_AMOUNT")
    private Double invoiceAmount;

    @Column(name = "INVOICE_TYPE")
	@JsonProperty("INVOICE_TYPE")
    private Integer invoiceType;

    @Column(name = "TO_DATE")
	@JsonProperty("TO_DATE")
    private Timestamp toDate;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "TEMPORARY_STUDENT_ID")
	@JsonProperty("TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    
}