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
	@JsonProperty("paymonk_transaction_id")
    private String paymonkTransactionId;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "PRODUCT_ID")
	@JsonProperty("product_id")
    private String productId;

    @Column(name = "ORDER_AMOUNT")
	@JsonProperty("order_amount")
    private Double orderAmount = 0D;

    @Column(name = "PAYMENT_AMOUNT")
	@JsonProperty("payment_amount")
    private Double paymentAmount = 0D;

    @Column(name = "ORDER_STATUS")
	@JsonProperty("order_status")
    private String orderStatus;

    @Column(name = "PAYMENT_STATUS")
	@JsonProperty("payment_status")
    private String paymentStatus;

    @Column(name = "CREATED_AT")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT")
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "STUDENT_NAME")
	@JsonProperty("student_name")
    private String studentName;

    @Column(name = "SENDER_ID")
	@JsonProperty("sender_id")
    private String senderId;

    @Column(name = "MOBILE_NUMBER")
	@JsonProperty("mobile_number")
    private String mobileNumber;

    @Column(name = "BATCH_ID")
	@JsonProperty("batch_id")
    private String batchId;

    @Column(name = "IS_SETTLED")
	@JsonProperty("is_settled")
    private Integer settled = 0;

    @Column(name = "BATCH_NAME")
	@JsonProperty("batch_name")
    private String batchName;

    @Column(name = "SETTLED_DATE")
	@JsonProperty("settled_date")
    private Timestamp settledDate;

    @Column(name = "BATCH_STATUS")
	@JsonProperty("batch_status")
    private String batchStatus;

    @Column(name = "SENDER_NAME")
	@JsonProperty("sender_name")
    private String senderName;

    @Column(name = "PROPERTY_NAME")
	@JsonProperty("property_name")
    private String propertyName;

    @Column(name = "CITY")
	@JsonProperty("city")
    private String CITY;

    
}