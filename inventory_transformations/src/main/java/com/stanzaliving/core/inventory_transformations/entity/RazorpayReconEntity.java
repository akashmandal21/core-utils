package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "RAZORPAY_RECON")
@Entity
@Data
public class RazorpayReconEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ENTITY_ID", insertable = false, nullable = false)
	@JsonProperty("ENTITY_ID")
    private String entityId;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "DEBIT")
	@JsonProperty("DEBIT")
    private Integer DEBIT = 0;

    @Column(name = "CREDIT")
	@JsonProperty("CREDIT")
    private Integer CREDIT = 0;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Integer AMOUNT = 0;

    @Column(name = "CURRENCY")
	@JsonProperty("CURRENCY")
    private String CURRENCY;

    @Column(name = "FEE")
	@JsonProperty("FEE")
    private Integer FEE = 0;

    @Column(name = "TAX")
	@JsonProperty("TAX")
    private Integer TAX = 0;

    @Column(name = "ON_HOLD")
	@JsonProperty("ON_HOLD")
    private Boolean onHold = Boolean.FALSE;

    @Column(name = "SETTLED")
	@JsonProperty("SETTLED")
    private Boolean SETTLED = Boolean.FALSE;

    @Column(name = "CREATED_AT")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "SETTLED_AT")
	@JsonProperty("SETTLED_AT")
    private Timestamp settledAt;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("SETTLEMENT_ID")
    private String settlementId;

    @Column(name = "DESCRIPTION")
	@JsonProperty("DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "PAYMENT_ID")
	@JsonProperty("PAYMENT_ID")
    private String paymentId;

    @Column(name = "SETTLEMENT_UTR")
	@JsonProperty("SETTLEMENT_UTR")
    private String settlementUtr;

    @Column(name = "ORDER_ID")
	@JsonProperty("ORDER_ID")
    private String orderId;

    @Column(name = "ORDER_RECEIPT")
	@JsonProperty("ORDER_RECEIPT")
    private String orderReceipt;

    @Column(name = "METHOD")
	@JsonProperty("METHOD")
    private String METHOD;

    @Column(name = "CARD_NETWORK")
	@JsonProperty("CARD_NETWORK")
    private String cardNetwork;

    @Column(name = "CARD_ISSUER")
	@JsonProperty("CARD_ISSUER")
    private String cardIssuer;

    @Column(name = "CARD_TYPE")
	@JsonProperty("CARD_TYPE")
    private String cardType;

    @Column(name = "DISPUTE_ID")
	@JsonProperty("DISPUTE_ID")
    private String disputeId;

    @Column(name = "ADDED_AT")
	@JsonProperty("ADDED_AT")
    private Timestamp addedAt;

    @Column(name = "NOTES")
	@JsonProperty("NOTES")
    private String NOTES;

    
}