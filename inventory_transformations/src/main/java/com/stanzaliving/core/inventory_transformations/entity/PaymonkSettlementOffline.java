package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "PAYMONK_SETTLEMENT_OFFLINE")
@Data
public class PaymonkSettlementOffline implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "PAYMONK_ID", nullable = false)
    private Integer paymonkId;

    @Column(name = "RETAILER")
    private String RETAILER;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "ORDER_AMOUNT")
    private Double orderAmount;

    @Column(name = "ORDER_STATUS")
    private String orderStatus;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "SENDER_NAME")
    private String senderName;

    @Column(name = "SENDER_ID")
    private Integer senderId;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    
}