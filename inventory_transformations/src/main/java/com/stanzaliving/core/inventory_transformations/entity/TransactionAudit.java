package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "TRANSACTION_AUDIT")
@Entity
@Data
public class TransactionAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_AUDIT_ID", insertable = false, nullable = false)
    private Integer transactionAuditId;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "GATEWAY_TRANCATION_ID1")
    private String gatewayTrancationId1;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "TRANSACTION_DATE", nullable = false)
    private LocalDateTime transactionDate;

    @Column(name = "PAYMENT_MODE_ID")
    private Integer paymentModeId;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "RECEIPT_ID")
    private String receiptId;

    @Column(name = "TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "GATEWAY_TRANSACTION_ID")
    private String gatewayTransactionId;

    @Column(name = "COMPLETION_DATE")
    private LocalDateTime completionDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType = "BOOKING";

    @Column(name = "ADDED_DATE")
    private LocalDateTime addedDate;

    @Column(name = "TRANSACTION_ID")
    private Integer transactionId;

    
}