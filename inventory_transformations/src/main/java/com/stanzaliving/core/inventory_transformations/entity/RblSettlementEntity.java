package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "RBL_SETTLEMENT")
@Entity
public class RblSettlementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SETTLEMENT_ID", insertable = false, nullable = false)
	@JsonProperty("SETTLEMENT_ID")
    private Integer settlementId;

    @Column(name = "BANK_STATEMENT_ID")
	@JsonProperty("BANK_STATEMENT_ID")
    private Integer bankStatementId = 0;

    @Column(name = "TRANSACTION_DATE")
	@JsonProperty("TRANSACTION_DATE")
    private Timestamp transactionDate;

    @Column(name = "TRANSACTION_DETAILS")
	@JsonProperty("TRANSACTION_DETAILS")
    private String transactionDetails;

    @Column(name = "CHEQUE_ID")
	@JsonProperty("CHEQUE_ID")
    private String chequeId;

    @Column(name = "VALUE_DATE")
	@JsonProperty("VALUE_DATE")
    private Timestamp valueDate;

    @Column(name = "WITHDRAWAL_AMOUNT")
	@JsonProperty("WITHDRAWAL_AMOUNT")
    private Double withdrawalAmount;

    @Column(name = "DEPOSIT_AMOUNT")
	@JsonProperty("DEPOSIT_AMOUNT")
    private Double depositAmount;

    @Column(name = "SETTLEMENT_TYPE_ID")
	@JsonProperty("SETTLEMENT_TYPE_ID")
    private Integer settlementTypeId = 0;

    
}