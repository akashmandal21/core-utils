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
	@JsonProperty("PAYMONK_ID")
    private Integer paymonkId;

    @Column(name = "RETAILER")
	@JsonProperty("RETAILER")
    private String RETAILER;

    @Column(name = "MOBILE_NUMBER")
	@JsonProperty("MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "ORDER_AMOUNT")
	@JsonProperty("ORDER_AMOUNT")
    private Double orderAmount;

    @Column(name = "ORDER_STATUS")
	@JsonProperty("ORDER_STATUS")
    private String orderStatus;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
	@JsonProperty("STUDENT_NAME")
    private String studentName;

    @Column(name = "SENDER_NAME")
	@JsonProperty("SENDER_NAME")
    private String senderName;

    @Column(name = "SENDER_ID")
	@JsonProperty("SENDER_ID")
    private Integer senderId;

    @Column(name = "CREATED_AT")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    
}