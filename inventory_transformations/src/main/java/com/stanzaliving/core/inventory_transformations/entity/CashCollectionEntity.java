package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "CASH_COLLECTION")
@Data
//@Entity
public class CashCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "TRANSACTION_ID", nullable = false)
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "TRANSACTION_STATUS", nullable = false)
	@JsonProperty("TRANSACTION_STATUS")
    private String transactionStatus;

    @Column(name = "TRANSACTION_BATCH")
	@JsonProperty("TRANSACTION_BATCH")
    private Integer transactionBatch = 0;

    @Column(name = "RC_CONFIRMED_DATE")
	@JsonProperty("RC_CONFIRMED_DATE")
    private Timestamp rcConfirmedDate;

    @Column(name = "TRANSACTION_TYPE")
	@JsonProperty("TRANSACTION_TYPE")
    private String transactionType;

    @Column(name = "RC_ID")
	@JsonProperty("RC_ID")
    private Integer rcId = 0;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "CREATION_DATE")
	@JsonProperty("CREATION_DATE")
    private Timestamp creationDate;

    @Column(name = "LAST_UPDATED")
	@JsonProperty("LAST_UPDATED")
    private Timestamp lastUpdated;

    @Column(name = "PHONE")
	@JsonProperty("PHONE")
    private String PHONE;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId = 0;

    
}