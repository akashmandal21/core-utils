package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "CHEQUE_SETTLEMENT")
public class ChequeSettlementEntity implements Serializable {
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

    @Column(name = "BANK_REF_NO")
	@JsonProperty("BANK_REF_NO")
    private String bankRefNo;

    @Column(name = "NARRATION")
	@JsonProperty("NARRATION")
    private String NARRATION;

    @Column(name = "CHEQUE_NO")
	@JsonProperty("CHEQUE_NO")
    private String chequeNo;

    @Column(name = "BANK_CODE")
	@JsonProperty("BANK_CODE")
    private String bankCode;

    @Column(name = "BANK_BRANCH_NAME")
	@JsonProperty("BANK_BRANCH_NAME")
    private String bankBranchName;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "DEBIT")
	@JsonProperty("DEBIT")
    private Double DEBIT = 0D;

    @Column(name = "CREDIT")
	@JsonProperty("CREDIT")
    private Double CREDIT = 0D;

    @Column(name = "SETTLEMENT_TYPE_ID")
	@JsonProperty("SETTLEMENT_TYPE_ID")
    private Integer settlementTypeId = 0;

    
}