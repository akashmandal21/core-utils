package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "PENALTY_AUDIT")
public class PenaltyAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PENALTY_AUDIT_ID", insertable = false, nullable = false)
    private Integer penaltyAuditId;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "PENALTY_AMOUNT")
    private Double penaltyAmount = 0D;

    @Column(name = "INVOICE_AMOUNT")
    private Double invoiceAmount = 0D;

    @Column(name = "AMOUNT_PAID")
    private Double amountPaid = 0D;

    @Column(name = "PENALTY_DAYS")
    private Integer penaltyDays = 0;

    @Column(name = "STATUS")
    private Boolean STATUS = Boolean.FALSE;

    @Column(name = "DUE_DATE", nullable = false)
    private LocalDateTime dueDate;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "PER_DAY_PENALTY", nullable = false)
    private Double perDayPenalty = 0D;

    
}