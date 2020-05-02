package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "CHEQUE_SETTLEMENT")
@Data
public class ChequeSettlement implements Serializable {
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

    @Column(name = "BANK_REF_NO")
    private String bankRefNo;

    @Column(name = "NARRATION")
    private String NARRATION;

    @Column(name = "CHEQUE_NO")
    private String chequeNo;

    @Column(name = "BANK_CODE")
    private String bankCode;

    @Column(name = "BANK_BRANCH_NAME")
    private String bankBranchName;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "DEBIT")
    private Double DEBIT = 0D;

    @Column(name = "CREDIT")
    private Double CREDIT = 0D;

    @Column(name = "SETTLEMENT_TYPE_ID")
    private Integer settlementTypeId = 0;

    
}