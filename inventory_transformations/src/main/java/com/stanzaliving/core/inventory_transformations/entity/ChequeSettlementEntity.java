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

    @Column(name = "BANK_REF_NO")
	@JsonProperty("bank_ref_no")
    private String bankRefNo;

    @Column(name = "NARRATION")
	@JsonProperty("narration")
    private String NARRATION;

    @Column(name = "CHEQUE_NO")
	@JsonProperty("cheque_no")
    private String chequeNo;

    @Column(name = "BANK_CODE")
	@JsonProperty("bank_code")
    private String bankCode;

    @Column(name = "BANK_BRANCH_NAME")
	@JsonProperty("bank_branch_name")
    private String bankBranchName;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "DEBIT")
	@JsonProperty("debit")
    private Double DEBIT = 0D;

    @Column(name = "CREDIT")
	@JsonProperty("credit")
    private Double CREDIT = 0D;

    @Column(name = "SETTLEMENT_TYPE_ID")
	@JsonProperty("settlement_type_id")
    private Integer settlementTypeId = 0;

    
}