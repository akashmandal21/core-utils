package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "TRANSACTION_SETTLEMENTS")
@Entity
public class TransactionSettlementsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("settlement_id")
    private String settlementId;

    @Column(name = "SETTLEMENT_ON")
	@JsonProperty("settlement_on")
    private Timestamp settlementOn;

    @Column(name = "SETTLEMENT_TYPE")
	@JsonProperty("settlement_type")
    private String settlementType;

    @Column(name = "SETTLEMENT_AMOUNT")
	@JsonProperty("settlement_amount")
    private Double settlementAmount = 0D;

    @Column(name = "ADDED_ON")
	@JsonProperty("added_on")
    private Timestamp addedOn;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_SETTLEMENTS_ID", insertable = false, nullable = false)
	@JsonProperty("transaction_settlements_id")
    private Integer transactionSettlementsId;

    @Column(name = "TRANSACTION_AMOUNT")
	@JsonProperty("transaction_amount")
    private Double transactionAmount;

    
}