package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PAYU_SETTLEMENT")
public class PayuSettlement {
	
	@Id
	@Column(name = "SETTLEMENT_ID")
	private String settlementId;
	
	@Column(name = "SETTLEMENT_COMPLETED_DATE")
	private String settlementCompletedDate;
	
	@Column(name ="SETTLEMENT_AMOUNT")
	private BigDecimal settlemetAmt;
	
	@Column(name = "UTR_NUMBER")
	private String UTRNumber;
	
	@OneToMany(mappedBy="payuSettlement", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<PayuSettlementTransaction> transactions = new HashSet<>(0);

	public String getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}

	public String getSettlementCompletedDate() {
		return settlementCompletedDate;
	}

	public void setSettlementCompletedDate(String settlementCompletedDate) {
		this.settlementCompletedDate = settlementCompletedDate;
	}

	public BigDecimal getSettlemetAmt() {
		return settlemetAmt;
	}

	public void setSettlemetAmt(BigDecimal settlemetAmt) {
		this.settlemetAmt = settlemetAmt;
	}

	public String getUTRNumber() {
		return UTRNumber;
	}

	public void setUTRNumber(String uTRNumber) {
		UTRNumber = uTRNumber;
	}

	public Set<PayuSettlementTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<PayuSettlementTransaction> transactions) {
		this.transactions = transactions;
	}
}
