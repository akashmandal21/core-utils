package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "HDFC_SETTLEMENT")
@Entity
public class HdfcSettlementEntity implements Serializable {
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

    @Column(name = "VALUE_DATE")
	@JsonProperty("VALUE_DATE")
    private Timestamp valueDate;

    @Column(name = "TRANSACTION_AMOUNT")
	@JsonProperty("TRANSACTION_AMOUNT")
    private Double transactionAmount;

    @Column(name = "DEBIT_CREDIT")
	@JsonProperty("DEBIT_CREDIT")
    private String debitCredit;

    @Column(name = "TRANSACTION_DESCRIPTION", columnDefinition = "text")
	@JsonProperty("TRANSACTION_DESCRIPTION")
    private String transactionDescription;

    @Column(name = "REFERENCE_NUMBER")
	@JsonProperty("REFERENCE_NUMBER")
    private String referenceNumber;

    @Column(name = "TRANSACTION_BRANCH")
	@JsonProperty("TRANSACTION_BRANCH")
    private String transactionBranch;

    @Column(name = "SETTLEMENT_TYPE_ID")
	@JsonProperty("SETTLEMENT_TYPE_ID")
    private Integer settlementTypeId = 0;

    
}