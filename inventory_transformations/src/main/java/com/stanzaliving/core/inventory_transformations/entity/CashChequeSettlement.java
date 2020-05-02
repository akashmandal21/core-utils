package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "CASH_CHEQUE_SETTLEMENT")
@Entity
@Data
public class CashChequeSettlement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
    private Integer transactionId;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "SETTLEMENT_DATE")
    private LocalDate settlementDate;

    @Column(name = "NARRATION")
    private String NARRATION;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "MODE")
    private String MODE;

    @Column(name = "SETTLEMENT_ID")
    private String settlementId;

    
}