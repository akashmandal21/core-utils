package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "PAYMONK_TRANSACTION")
@Data
@Entity
public class PaymonkTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
    private Integer transactionId;

    @Column(name = "BATCH_ID")
    private String batchId;

    @Column(name = "PAYMONK_STATUS")
    private String paymonkStatus;

    @Column(name = "PAYMONK_TRANSACTION_ID")
    private String paymonkTransactionId;

    @Column(name = "SENDER_ID")
    private String senderId;

    @Column(name = "BATCH_CLOSED")
    private Boolean batchClosed;

    
}