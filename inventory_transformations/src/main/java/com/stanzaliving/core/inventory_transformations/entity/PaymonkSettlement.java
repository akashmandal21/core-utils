package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "PAYMONK_SETTLEMENT")
@Data
public class PaymonkSettlement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "PAYMONK_TRANSACTION_ID", nullable = false)
    private String paymonkTransactionId;

    @Column(name = "TYPE", nullable = false)
    private String TYPE;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "ORDER_AMOUNT")
    private Double orderAmount = 0D;

    @Column(name = "PAYMENT_AMOUNT")
    private Double paymentAmount = 0D;

    @Column(name = "ORDER_STATUS")
    private String orderStatus;

    @Column(name = "PAYMENT_STATUS")
    private String paymentStatus;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "SENDER_ID")
    private String senderId;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "BATCH_ID")
    private String batchId;

    @Column(name = "IS_SETTLED")
    private Integer settled = 0;

    @Column(name = "BATCH_NAME")
    private String batchName;

    @Column(name = "SETTLED_DATE")
    private LocalDateTime settledDate;

    @Column(name = "BATCH_STATUS")
    private String batchStatus;

    @Column(name = "SENDER_NAME")
    private String senderName;

    @Column(name = "PROPERTY_NAME")
    private String propertyName;

    @Column(name = "CITY")
    private String CITY;

    
}