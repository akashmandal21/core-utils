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
	@JsonProperty("entity_id")
    private String entityId;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "DEBIT")
	@JsonProperty("debit")
    private Integer DEBIT = 0;

    @Column(name = "CREDIT")
	@JsonProperty("credit")
    private Integer CREDIT = 0;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Integer AMOUNT = 0;

    @Column(name = "CURRENCY")
	@JsonProperty("currency")
    private String CURRENCY;

    @Column(name = "FEE")
	@JsonProperty("fee")
    private Integer FEE = 0;

    @Column(name = "TAX")
	@JsonProperty("tax")
    private Integer TAX = 0;

    @Column(name = "ON_HOLD")
	@JsonProperty("on_hold")
    private Boolean onHold = Boolean.FALSE;

    @Column(name = "SETTLED")
	@JsonProperty("settled")
    private Boolean SETTLED = Boolean.FALSE;

    @Column(name = "CREATED_AT")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "SETTLED_AT")
	@JsonProperty("settled_at")
    private Timestamp settledAt;

    @Column(name = "SETTLEMENT_ID")
	@JsonProperty("settlement_id")
    private String settlementId;

    @Column(name = "DESCRIPTION")
	@JsonProperty("description")
    private String DESCRIPTION;

    @Column(name = "PAYMENT_ID")
	@JsonProperty("payment_id")
    private String paymentId;

    @Column(name = "SETTLEMENT_UTR")
	@JsonProperty("settlement_utr")
    private String settlementUtr;

    @Column(name = "ORDER_ID")
	@JsonProperty("order_id")
    private String orderId;

    @Column(name = "ORDER_RECEIPT")
	@JsonProperty("order_receipt")
    private String orderReceipt;

    @Column(name = "METHOD")
	@JsonProperty("method")
    private String METHOD;

    @Column(name = "CARD_NETWORK")
	@JsonProperty("card_network")
    private String cardNetwork;

    @Column(name = "CARD_ISSUER")
	@JsonProperty("card_issuer")
    private String cardIssuer;

    @Column(name = "CARD_TYPE")
	@JsonProperty("card_type")
    private String cardType;

    @Column(name = "DISPUTE_ID")
	@JsonProperty("dispute_id")
    private String disputeId;

    @Column(name = "ADDED_AT")
	@JsonProperty("added_at")
    private Timestamp addedAt;

    @Column(name = "NOTES")
	@JsonProperty("notes")
    private String NOTES;

    
}