package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "HDFC_SETTLEMENT")
@Data
@Entity
public class HdfcSettlement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SETTLEMENT_ID", insertable = false, nullable = false)
    private Integer settlementId;

    @Column(name = "BANK_STATEMENT_ID")
    private Integer bankStatementId = 0;

    @Column(name = "TRANSACTION_DATE")
    private LocalDateTime transactionDate;

    @Column(name = "VALUE_DATE")
    private LocalDateTime valueDate;

    @Column(name = "TRANSACTION_AMOUNT")
    private Double transactionAmount;

    @Column(name = "DEBIT_CREDIT")
    private String debitCredit;

    @Column(name = "TRANSACTION_DESCRIPTION")
    private String transactionDescription;

    @Column(name = "REFERENCE_NUMBER")
    private String referenceNumber;

    @Column(name = "TRANSACTION_BRANCH")
    private String transactionBranch;

    @Column(name = "SETTLEMENT_TYPE_ID")
    private Integer settlementTypeId = 0;

    
}