package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "RAZORPAYX_TRANSACTION")
@Entity
public class RazorpayxTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RAZORPAY_TRANS_ID", insertable = false, nullable = false)
	@JsonProperty("razorpay_trans_id")
    private Integer razorpayTransId;

    @Column(name = "PAYOUT_ID")
	@JsonProperty("payout_id")
    private String payoutId;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("transaction_id")
    private String transactionId;

    @Column(name = "CONTACT_ID")
	@JsonProperty("contact_id")
    private String contactId;

    @Column(name = "FUND_ACCOUNT_ID")
	@JsonProperty("fund_account_id")
    private String fundAccountId;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    
}