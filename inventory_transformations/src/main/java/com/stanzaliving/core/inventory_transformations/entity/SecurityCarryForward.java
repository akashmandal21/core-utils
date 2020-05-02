package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "SECURITY_CARRY_FORWARD")
@Data
@Entity
public class SecurityCarryForward implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SECURITY_CARRY_FORWARD_ID", insertable = false, nullable = false)
    private Integer securityCarryForwardId;

    @Column(name = "ISSUE_DATE")
    private LocalDateTime issueDate;

    @Column(name = "MENTIONED_AMOUNT")
    private Double mentionedAmount;

    @Column(name = "RECEIPT_ID")
    private String receiptId;

    @Column(name = "SECURITY_AMOUNT_CARRY_FORWADED")
    private Double securityAmountCarryForwaded;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    
}