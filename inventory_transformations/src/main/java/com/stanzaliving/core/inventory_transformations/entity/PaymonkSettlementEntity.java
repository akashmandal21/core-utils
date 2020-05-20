package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "PAYMONK_SETTLEMENT")
public class PaymonkSettlementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "PAYMONK_TRANSACTION_ID", nullable = false)
	@JsonProperty("PAYMONK_TRANSACTION_ID")
    private String paymonkTransactionId;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "PRODUCT_ID")
	@JsonProperty("PRODUCT_ID")
    private String productId;

    @Column(name = "ORDER_AMOUNT")
	@JsonProperty("ORDER_AMOUNT")
    private Double orderAmount = 0D;

    @Column(name = "PAYMENT_AMOUNT")
	@JsonProperty("PAYMENT_AMOUNT")
    private Double paymentAmount = 0D;

    @Column(name = "ORDER_STATUS")
	@JsonProperty("ORDER_STATUS")
    private String orderStatus;

    @Column(name = "PAYMENT_STATUS")
	@JsonProperty("PAYMENT_STATUS")
    private String paymentStatus;

    @Column(name = "CREATED_AT")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT")
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
	@JsonProperty("STUDENT_NAME")
    private String studentName;

    @Column(name = "SENDER_ID")
	@JsonProperty("SENDER_ID")
    private String senderId;

    @Column(name = "MOBILE_NUMBER")
	@JsonProperty("MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "BATCH_ID")
	@JsonProperty("BATCH_ID")
    private String batchId;

    @Column(name = "IS_SETTLED")
	@JsonProperty("IS_SETTLED")
    private Integer settled = 0;

    @Column(name = "BATCH_NAME")
	@JsonProperty("BATCH_NAME")
    private String batchName;

    @Column(name = "SETTLED_DATE")
	@JsonProperty("SETTLED_DATE")
    private Timestamp settledDate;

    @Column(name = "BATCH_STATUS")
	@JsonProperty("BATCH_STATUS")
    private String batchStatus;

    @Column(name = "SENDER_NAME")
	@JsonProperty("SENDER_NAME")
    private String senderName;

    @Column(name = "PROPERTY_NAME")
	@JsonProperty("PROPERTY_NAME")
    private String propertyName;

    @Column(name = "CITY")
	@JsonProperty("CITY")
    private String CITY;

    
}