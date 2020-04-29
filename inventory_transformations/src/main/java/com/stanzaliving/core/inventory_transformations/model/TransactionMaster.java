package com.stanzaliving.core.inventory_transformations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "TRANSACTION_SETTLEMENTS")
public class TransactionMaster {
	
	@Id
	@GeneratedValue
	@Column(name="TRANSACTION_SETTLEMENTS_ID")
	private int id;
	
	
	@Column(name="TRANSACTION_ID")
	private Integer transactionId;
	
	@Column(name  = "SETTLEMENT_ID")
	private String settlementId;
	
	@Column(name  = "SETTLEMENT_ON")
	private Date settlementOnDate;
	
	@Column(name  = "SETTLEMENT_TYPE")
	private String settlementType;
	
	@Column(name  = "SETTLEMENT_AMOUNT")
	private BigDecimal settlementAmt;
	
	@Column(name  = "TRANSACTION_AMOUNT")
	private Double transactionAmount;
	
	@Column(name = "STATUS" ,nullable = true)
	private String status;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}

	public Date getSettlementOnDate() {
		return settlementOnDate;
	}

	public void setSettlementOnDate(Date settlementOnDate) {
		this.settlementOnDate = settlementOnDate;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public BigDecimal getSettlementAmt() {
		return settlementAmt;
	}

	public void setSettlementAmt(BigDecimal settlementAmt) {
		this.settlementAmt = settlementAmt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

}
