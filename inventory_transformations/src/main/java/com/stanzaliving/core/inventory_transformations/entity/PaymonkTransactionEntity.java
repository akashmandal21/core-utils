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
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "BATCH_ID")
	@JsonProperty("batch_id")
    private String batchId;

    @Column(name = "PAYMONK_STATUS")
	@JsonProperty("paymonk_status")
    private String paymonkStatus;

    @Column(name = "PAYMONK_TRANSACTION_ID")
	@JsonProperty("paymonk_transaction_id")
    private String paymonkTransactionId;

    @Column(name = "SENDER_ID")
	@JsonProperty("sender_id")
    private String senderId;

    @Column(name = "BATCH_CLOSED")
	@JsonProperty("batch_closed")
    private Boolean batchClosed;

    
}