package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CASH_COLLECTION")
public class CashCollection implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "TRANSACTION_ID", nullable = false)
    private Integer transactionId;

    @Column(name = "TRANSACTION_STATUS", nullable = false)
    private String transactionStatus;

    @Column(name = "TRANSACTION_BATCH")
    private Integer transactionBatch = 0;

    @Column(name = "RC_CONFIRMED_DATE")
    private LocalDateTime rcConfirmedDate;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;

    @Column(name = "RC_ID")
    private Integer rcId = 0;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "LAST_UPDATED")
    private LocalDateTime lastUpdated;

    @Column(name = "PHONE")
    private String PHONE;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId = 0;

    
}