package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "RBL_SETTLEMENT")
public class RblSettlement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SETTLEMENT_ID", insertable = false, nullable = false)
    private Integer settlementId;

    @Column(name = "BANK_STATEMENT_ID")
    private Integer bankStatementId = 0;

    @Column(name = "TRANSACTION_DATE")
    private LocalDateTime transactionDate;

    @Column(name = "TRANSACTION_DETAILS")
    private String transactionDetails;

    @Column(name = "CHEQUE_ID")
    private String chequeId;

    @Column(name = "VALUE_DATE")
    private LocalDateTime valueDate;

    @Column(name = "WITHDRAWAL_AMOUNT")
    private Double withdrawalAmount;

    @Column(name = "DEPOSIT_AMOUNT")
    private Double depositAmount;

    @Column(name = "SETTLEMENT_TYPE_ID")
    private Integer settlementTypeId = 0;

    
}