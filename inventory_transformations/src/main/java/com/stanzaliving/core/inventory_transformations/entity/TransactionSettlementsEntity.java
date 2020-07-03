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
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("SETTLEMENT_ID")
    private String settlementId;

    @Column(name = "SETTLEMENT_ON")
	@JsonProperty("SETTLEMENT_ON")
    private Timestamp settlementOn;

    @Column(name = "SETTLEMENT_TYPE")
	@JsonProperty("SETTLEMENT_TYPE")
    private String settlementType;

    @Column(name = "SETTLEMENT_AMOUNT")
	@JsonProperty("SETTLEMENT_AMOUNT")
    private Double settlementAmount = 0D;

    @Column(name = "ADDED_ON")
	@JsonProperty("ADDED_ON")
    private Timestamp addedOn;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_SETTLEMENTS_ID", insertable = false, nullable = false)
	@JsonProperty("TRANSACTION_SETTLEMENTS_ID")
    private Integer transactionSettlementsId;

    @Column(name = "TRANSACTION_AMOUNT")
	@JsonProperty("TRANSACTION_AMOUNT")
    private Double transactionAmount;

    
}