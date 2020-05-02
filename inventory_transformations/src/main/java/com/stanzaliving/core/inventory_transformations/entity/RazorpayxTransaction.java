package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "RAZORPAYX_TRANSACTION")
@Entity
@Data
public class RazorpayxTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RAZORPAY_TRANS_ID", insertable = false, nullable = false)
    private Integer razorpayTransId;

    @Column(name = "PAYOUT_ID")
    private String payoutId;

    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name = "CONTACT_ID")
    private String contactId;

    @Column(name = "FUND_ACCOUNT_ID")
    private String fundAccountId;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "TYPE")
    private String TYPE;

    
}