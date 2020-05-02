package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PENALTY")
public class PENALTY implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
    private String studentId;

    @Column(name = "PENALTY_AMOUNT")
    private Double penaltyAmount = 0D;

    @Column(name = "INVOICE_AMOUNT")
    private Double invoiceAmount = 0D;

    @Column(name = "AMOUNT_PAID")
    private Double amountPaid = 0D;

    @Column(name = "PENALTY_DAYS")
    private Integer penaltyDays = 0;

    @Column(name = "STATUS", nullable = false)
    private Boolean STATUS = Boolean.FALSE;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "PER_DAY_PENALTY", nullable = false)
    private Double perDayPenalty = 0D;

    @Column(name = "DUE_DATE", nullable = false)
    private LocalDateTime dueDate;

    
}