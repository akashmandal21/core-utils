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
	@JsonProperty("settlement_id")
    private Integer settlementId;

    @Column(name = "BANK_STATEMENT_ID")
	@JsonProperty("bank_statement_id")
    private Integer bankStatementId = 0;

    @Column(name = "TRANSACTION_DATE")
	@JsonProperty("transaction_date")
    private Timestamp transactionDate;

    @Column(name = "TRANSACTION_DETAILS")
	@JsonProperty("transaction_details")
    private String transactionDetails;

    @Column(name = "CHEQUE_ID")
	@JsonProperty("cheque_id")
    private String chequeId;

    @Column(name = "VALUE_DATE")
	@JsonProperty("value_date")
    private Timestamp valueDate;

    @Column(name = "WITHDRAWAL_AMOUNT")
	@JsonProperty("withdrawal_amount")
    private Double withdrawalAmount;

    @Column(name = "DEPOSIT_AMOUNT")
	@JsonProperty("deposit_amount")
    private Double depositAmount;

    @Column(name = "SETTLEMENT_TYPE_ID")
	@JsonProperty("settlement_type_id")
    private Integer settlementTypeId = 0;

    
}