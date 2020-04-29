package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "RAZORPAY_RECON")
public class RazorPayTransaction {
	
	@Id()
	@Column(name="ENTITY_ID")
	private String entityId;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="DEBIT")
	private int debit;
	
	@Column(name="CREDIT")
	private int credit;
	
	@Column(name="AMOUNT")
	private int amount;
	
	@Column(name="CURRENCY")
	private String currency;
	
	@Column(name="FEE")
	private int fee;
	
	@Column(name="TAX")
	private int tax;
	
	@Column(name="ON_HOLD")
	private boolean onHold;
	
	@Column(name="SETTLED")
	private boolean settled;
	
	@Column(name="CREATED_AT")
	private Date createdAt;
	
	@Column(name="SETTLED_AT")
	private Date settledAt;
	
	@Column(name="SETTLEMENT_ID")
	private String settlementId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="PAYMENT_ID")
	private String paymentId;
	
	@Column(name="SETTLEMENT_UTR")
	private String settlementUTR;
	
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name="ORDER_RECEIPT")
	private String orderReceipt;
	
	@Column(name="METHOD")
	private String method;
	
	@Column(name="CARD_NETWORK")
	private String cardNetwork;
	
	@Column(name="CARD_ISSUER")
	private String cardIssuer;
	
	@Column(name="CARD_TYPE")
	private String cardType;
	
	@Column(name="DISPUTE_ID")
	private String disputeId;
	
	@Column(name = "ADDED_AT")
	private Date addedAt;
	
	@Column(name ="notes")
	private String notes;

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public boolean isOnHold() {
		return onHold;
	}

	public void setOnHold(boolean onHold) {
		this.onHold = onHold;
	}

	public boolean isSettled() {
		return settled;
	}

	public void setSettled(boolean settled) {
		this.settled = settled;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getSettledAt() {
		return settledAt;
	}

	public void setSettledAt(Date settledAt) {
		this.settledAt = settledAt;
	}

	public Date getAddedAt() {
		return addedAt;
	}

	public void setAddedAt(Date addedAt) {
		this.addedAt = addedAt;
	}

	public String getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getSettlementUTR() {
		return settlementUTR;
	}

	public void setSettlementUTR(String settlementUTR) {
		this.settlementUTR = settlementUTR;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderReceipt() {
		return orderReceipt;
	}

	public void setOrderReceipt(String orderReceipt) {
		this.orderReceipt = orderReceipt;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getCardNetwork() {
		return cardNetwork;
	}

	public void setCardNetwork(String cardNetwork) {
		this.cardNetwork = cardNetwork;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDisputeId() {
		return disputeId;
	}

	public void setDisputeId(String disputeId) {
		this.disputeId = disputeId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	

}
