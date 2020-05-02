package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "RAZORPAY_RECON")
@Entity
@Data
public class RazorpayRecon implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ENTITY_ID", insertable = false, nullable = false)
    private String entityId;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "DEBIT")
    private Integer DEBIT = 0;

    @Column(name = "CREDIT")
    private Integer CREDIT = 0;

    @Column(name = "AMOUNT")
    private Integer AMOUNT = 0;

    @Column(name = "CURRENCY")
    private String CURRENCY;

    @Column(name = "FEE")
    private Integer FEE = 0;

    @Column(name = "TAX")
    private Integer TAX = 0;

    @Column(name = "ON_HOLD")
    private Boolean onHold = Boolean.FALSE;

    @Column(name = "SETTLED")
    private Boolean SETTLED = Boolean.FALSE;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "SETTLED_AT")
    private LocalDateTime settledAt;

    @Column(name = "SETTLEMENT_ID")
    private String settlementId;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "PAYMENT_ID")
    private String paymentId;

    @Column(name = "SETTLEMENT_UTR")
    private String settlementUtr;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "ORDER_RECEIPT")
    private String orderReceipt;

    @Column(name = "METHOD")
    private String METHOD;

    @Column(name = "CARD_NETWORK")
    private String cardNetwork;

    @Column(name = "CARD_ISSUER")
    private String cardIssuer;

    @Column(name = "CARD_TYPE")
    private String cardType;

    @Column(name = "DISPUTE_ID")
    private String disputeId;

    @Column(name = "ADDED_AT")
    private LocalDateTime addedAt;

    @Column(name = "NOTES")
    private String NOTES;

    
}