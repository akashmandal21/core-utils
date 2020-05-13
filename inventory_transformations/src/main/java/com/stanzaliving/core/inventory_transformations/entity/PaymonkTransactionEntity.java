package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PAYMONK_TRANSACTION")
public class PaymonkTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "BATCH_ID")
	@JsonProperty("BATCH_ID")
    private String batchId;

    @Column(name = "PAYMONK_STATUS")
	@JsonProperty("PAYMONK_STATUS")
    private String paymonkStatus;

    @Column(name = "PAYMONK_TRANSACTION_ID")
	@JsonProperty("PAYMONK_TRANSACTION_ID")
    private String paymonkTransactionId;

    @Column(name = "SENDER_ID")
	@JsonProperty("SENDER_ID")
    private String senderId;

    @Column(name = "BATCH_CLOSED")
	@JsonProperty("BATCH_CLOSED")
    private Boolean batchClosed;

    
}