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
	@JsonProperty("settlement_id")
    private Integer settlementId;

    @Column(name = "BANK_STATEMENT_ID")
	@JsonProperty("bank_statement_id")
    private Integer bankStatementId = 0;

    @Column(name = "TRANSACTION_DATE")
	@JsonProperty("transaction_date")
    private Timestamp transactionDate;

    @Column(name = "VALUE_DATE")
	@JsonProperty("value_date")
    private Timestamp valueDate;

    @Column(name = "TRANSACTION_AMOUNT")
	@JsonProperty("transaction_amount")
    private Double transactionAmount;

    @Column(name = "DEBIT_CREDIT")
	@JsonProperty("debit_credit")
    private String debitCredit;

    @Column(name = "TRANSACTION_DESCRIPTION", columnDefinition = "text")
	@JsonProperty("transaction_description")
    private String transactionDescription;

    @Column(name = "REFERENCE_NUMBER")
	@JsonProperty("reference_number")
    private String referenceNumber;

    @Column(name = "TRANSACTION_BRANCH")
	@JsonProperty("transaction_branch")
    private String transactionBranch;

    @Column(name = "SETTLEMENT_TYPE_ID")
	@JsonProperty("settlement_type_id")
    private Integer settlementTypeId = 0;

    
}