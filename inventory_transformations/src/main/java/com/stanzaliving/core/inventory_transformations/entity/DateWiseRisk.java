package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "DATE_WISE_RISK")
@Data
public class DateWiseRisk implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
    private String studentId;

    @Id
    @Column(name = "DATA_DATE", insertable = false, nullable = false)
    private LocalDate dataDate;

    @Column(name = "AMOUNT_DUE")
    private Double amountDue;

    @Column(name = "TRANSACTION_AMOUNT")
    private Double transactionAmount;

    @Column(name = "RISK_TYPE")
    private Integer riskType;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "INVOICE_AMOUNT_DUE")
    private Double invoiceAmountDue = 0D;

    
}