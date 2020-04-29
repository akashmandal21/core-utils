package com.stanzaliving.core.inventory_transformations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CASH_COLLECTION")
public class CashCollection {
	
	@Id
	private int id;
	
	@JoinColumn(name = "TRANSACTION_ID")
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Transaction cashTransaction;
	
	@Column(name = "TRANSACTION_STATUS")
	private String transactionStatus;
	
	@Column(name = "TRANSACTION_BATCH")
	private int transactionBatch;
	
	@Column(name = "RC_CONFIRMED_DATE")
	private Date rcConfirmedDate;
	
	@Getter
	@Setter
	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RC_ID",columnDefinition = "int default 0")
	private ResidenceRc rc;
	
	@Column(name = "CREATED_BY")
	private String createdBy; 
	
	@Column(name = "LAST_UPDATED")
	private Date lastUpdated;
	
	@Column(name = "RESIDENCE_ID")
	private int residenceId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Transaction getCashTransaction() {
		return cashTransaction;
	}

	public void setCashTransaction(Transaction cashTransaction) {
		this.cashTransaction = cashTransaction;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public int getTransactionBatch() {
		return transactionBatch;
	}

	public void setTransactionBatch(int transactionBatch) {
		this.transactionBatch = transactionBatch;
	}

	public Date getRcConfirmedDate() {
		return rcConfirmedDate;
	}

	public void setRcConfirmedDate(Date rcConfirmedDate) {
		this.rcConfirmedDate = rcConfirmedDate;
	}

	public ResidenceRc getRc() {
		return rc;
	}

	public void setRc(ResidenceRc rc) {
		this.rc = rc;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public int getResidenceId() {
		return residenceId;
	}

	public void setResidenceId(int residenceId) {
		this.residenceId = residenceId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + transactionBatch;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CashCollection other = (CashCollection) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (transactionBatch != other.transactionBatch)
			return false;
		return true;
	}

	
	
	
	
}
