package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "PAYMONK_SETTLEMENT_NEW")
public class PaymonkSettlementNew implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ORDERID", nullable = false)
    private Integer ORDERID;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "SENDER_NAME")
    private String senderName;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "SETTLEMENT_DATE")
    private LocalDateTime settlementDate;

    @Column(name = "CHARGES")
    private Double CHARGES;

    @Column(name = "TDS")
    private Double TDS;

    @Column(name = "GST")
    private Double GST;

    @Column(name = "TOTAL_CHARGES")
    private Double totalCharges;

    @Column(name = "TOTAL_PAYOUT")
    private Double totalPayout;

    
}