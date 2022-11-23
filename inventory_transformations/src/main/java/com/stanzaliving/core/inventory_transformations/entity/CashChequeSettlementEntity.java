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
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "SETTLEMENT_DATE")
	@JsonProperty("SETTLEMENT_DATE")
    private Date settlementDate;

    @Column(name = "NARRATION")
	@JsonProperty("NARRATION")
    private String NARRATION;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "MODE")
	@JsonProperty("MODE")
    private String MODE;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("SETTLEMENT_ID")
    private String settlementId;

    
}