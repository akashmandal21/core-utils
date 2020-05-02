package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "TEMPORARY_INVOICE")
@Data
@Entity
public class TemporaryInvoice implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEMPORARY_INVOICE_ID", insertable = false, nullable = false)
    private Integer temporaryInvoiceId;

    @Column(name = "INVOICE_DUE")
    private Double invoiceDue;

    @Column(name = "INVOICE_PAID")
    private Double invoicePaid;

    @Column(name = "CREATED")
    private LocalDateTime CREATED;

    @Column(name = "DUE_DATE")
    private LocalDateTime dueDate;

    @Column(name = "EXECUTION_DATE")
    private LocalDateTime executionDate;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "INVOICE_AMOUNT")
    private Double invoiceAmount;

    @Column(name = "INVOICE_TYPE")
    private Integer invoiceType;

    @Column(name = "TO_DATE")
    private LocalDateTime toDate;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    
}