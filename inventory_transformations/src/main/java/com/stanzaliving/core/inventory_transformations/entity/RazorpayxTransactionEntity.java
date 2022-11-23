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
	@JsonProperty("RAZORPAY_TRANS_ID")
    private Integer razorpayTransId;

    @Column(name = "PAYOUT_ID")
	@JsonProperty("PAYOUT_ID")
    private String payoutId;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("TRANSACTION_ID")
    private String transactionId;

    @Column(name = "CONTACT_ID")
	@JsonProperty("CONTACT_ID")
    private String contactId;

    @Column(name = "FUND_ACCOUNT_ID")
	@JsonProperty("FUND_ACCOUNT_ID")
    private String fundAccountId;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    
}