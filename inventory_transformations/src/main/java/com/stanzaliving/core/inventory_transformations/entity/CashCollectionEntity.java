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
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "TRANSACTION_STATUS", nullable = false)
	@JsonProperty("transaction_status")
    private String transactionStatus;

    @Column(name = "TRANSACTION_BATCH")
	@JsonProperty("transaction_batch")
    private Integer transactionBatch = 0;

    @Column(name = "RC_CONFIRMED_DATE")
	@JsonProperty("rc_confirmed_date")
    private Timestamp rcConfirmedDate;

    @Column(name = "TRANSACTION_TYPE")
	@JsonProperty("transaction_type")
    private String transactionType;

    @Column(name = "RC_ID")
	@JsonProperty("rc_id")
    private Integer rcId = 0;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "CREATION_DATE")
	@JsonProperty("creation_date")
    private Timestamp creationDate;

    @Column(name = "LAST_UPDATED")
	@JsonProperty("last_updated")
    private Timestamp lastUpdated;

    @Column(name = "PHONE")
	@JsonProperty("phone")
    private String PHONE;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId = 0;

    
}