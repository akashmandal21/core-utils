package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "TRANSACTION")
@Entity
public class TRANSACTION implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
    private Integer transactionId;

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

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "PAYMENT_TRANSACTION_ID")
    private Long paymentTransactionId;

    @Column(name = "PARENT_COMPANY", nullable = false)
    private Integer parentCompany = 0;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    
}