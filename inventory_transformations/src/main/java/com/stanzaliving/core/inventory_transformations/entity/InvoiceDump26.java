package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "INVOICE_DUMP_26")
@Data
public class InvoiceDump26 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_ID", insertable = false, nullable = false)
    private Integer invoiceId;

    @Column(name = "AMOUNT_DUE")
    private Double amountDue;

    @Column(name = "AMOUNT_PAID")
    private Double amountPaid;

    @Column(name = "DATE_CREATED", nullable = false)
    private LocalDateTime dateCreated;

    @Column(name = "DUE_DATE", nullable = false)
    private LocalDateTime dueDate;

    @Column(name = "INVOICE_AMOUNT")
    private Double invoiceAmount;

    @Column(name = "INVOICE_TYPE")
    private Integer invoiceType;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "STANZA_INVOICE_ID")
    private String stanzaInvoiceId;

    @Column(name = "FROM_DATE")
    private LocalDateTime fromDate;

    @Column(name = "TO_DATE")
    private LocalDateTime toDate;

    @Column(name = "HSN_SAC")
    private String hsnSac;

    @Column(name = "DATE_PAID")
    private LocalDateTime datePaid;

    @Column(name = "IS_SENT")
    private Integer sent = 0;

    
}