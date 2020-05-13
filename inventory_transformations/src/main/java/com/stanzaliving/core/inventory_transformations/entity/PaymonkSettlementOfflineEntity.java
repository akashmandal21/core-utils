package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "PAYMONK_SETTLEMENT_OFFLINE")
@Data
@Entity
public class PaymonkSettlementOfflineEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "PAYMONK_ID", nullable = false)
	@JsonProperty("paymonk_id")
    private Integer paymonkId;

    @Column(name = "RETAILER")
	@JsonProperty("retailer")
    private String RETAILER;

    @Column(name = "MOBILE_NUMBER")
	@JsonProperty("mobile_number")
    private String mobileNumber;

    @Column(name = "ORDER_AMOUNT")
	@JsonProperty("order_amount")
    private Double orderAmount;

    @Column(name = "ORDER_STATUS")
	@JsonProperty("order_status")
    private String orderStatus;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "STUDENT_NAME")
	@JsonProperty("student_name")
    private String studentName;

    @Column(name = "SENDER_NAME")
	@JsonProperty("sender_name")
    private String senderName;

    @Column(name = "SENDER_ID")
	@JsonProperty("sender_id")
    private Integer senderId;

    @Column(name = "CREATED_AT")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    
}