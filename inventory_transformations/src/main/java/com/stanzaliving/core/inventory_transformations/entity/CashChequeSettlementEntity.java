package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Table(name = "CASH_CHEQUE_SETTLEMENT")
@Entity
@Data
public class CashChequeSettlementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "SETTLEMENT_DATE")
	@JsonProperty("settlement_date")
    private Date settlementDate;

    @Column(name = "NARRATION")
	@JsonProperty("narration")
    private String NARRATION;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "MODE")
	@JsonProperty("mode")
    private String MODE;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("settlement_id")
    private String settlementId;

    
}