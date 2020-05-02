package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TRANSACTION_SETTLEMENTS")
public class TransactionSettlements implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "SETTLEMENT_ID")
    private String settlementId;

    @Column(name = "SETTLEMENT_ON")
    private LocalDateTime settlementOn;

    @Column(name = "SETTLEMENT_TYPE")
    private String settlementType;

    @Column(name = "SETTLEMENT_AMOUNT")
    private Double settlementAmount = 0D;

    @Column(name = "ADDED_ON")
    private LocalDateTime addedOn;

    @Column(name = "STATUS")
    private String STATUS;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_SETTLEMENTS_ID", insertable = false, nullable = false)
    private Integer transactionSettlementsId;

    @Column(name = "TRANSACTION_AMOUNT")
    private Double transactionAmount;

    
}