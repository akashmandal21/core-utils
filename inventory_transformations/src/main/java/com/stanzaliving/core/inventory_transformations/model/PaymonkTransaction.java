package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "PAYMONK_TRANSACTION")
public class PaymonkTransaction {

	@Id
	private int id;

	@Column(name = "PAYMONK_TRANSACTION_ID")
	private String paymonkTransactionId;

	@JoinColumn(name = "TRANSACTION_ID")
	@OneToOne(fetch = FetchType.EAGER)
	@MapsId
	private Transaction transaction;

	@Column(name = "BATCH_ID")
	private String batchId;

	@Column(name = "SENDER_ID")
	private String senderId;

	@Column(name = "PAYMONK_STATUS")
	private String paymonkStatus;
	
	@Column(name = "BATCH_CLOSED")
	private boolean batchClosed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaymonkTransactionId() {
		return paymonkTransactionId;
	}

	public void setPaymonkTransactionId(String paymonkTransactionId) {
		this.paymonkTransactionId = paymonkTransactionId;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getPaymonkStatus() {
		return paymonkStatus;
	}

	public void setPaymonkStatus(String paymonkStatus) {
		this.paymonkStatus = paymonkStatus;
	}

	public boolean isBatchClosed() {
		return batchClosed;
	}

	public void setBatchClosed(boolean batchClosed) {
		this.batchClosed = batchClosed;
	}

}
