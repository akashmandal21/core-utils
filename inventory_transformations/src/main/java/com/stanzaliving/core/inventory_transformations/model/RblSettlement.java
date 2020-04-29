package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="RBL_SETTLEMENT")
public class RblSettlement {

	@Id()
	@GeneratedValue
	@Column(name="SETTLEMENT_ID", nullable=false)
	private int settlementId;
	
	@Column(name = "BANK_STATEMENT_ID", nullable=false)
	private Integer bankStatementId;
	
	@Column(name = "TRANSACTION_DATE")
	private Date transactionDate;
	
	@Column(name="TRANSACTION_DETAILS")
	private String transactionDetails;
	
	@Column(name = "CHEQUE_ID")
	private String chequeId;
	
	@Column(name="WITHDRAWAL_AMOUNT")
	private BigDecimal withdrawalAmount;
	
	@Column(name="VALUE_DATE")
	private Date valueDate;
	
	@Column(name="DEPOSIT_AMOUNT")
	private BigDecimal depositAmount;
	
	@Column(name="SETTLEMENT_TYPE_ID",  nullable = false, columnDefinition = "int default 0")
	private int settlementTypeId;
	
	public Integer getBankStatementId() {
		return bankStatementId;
	}

	public void setBankStatementId(Integer bankStatementId) {
		this.bankStatementId = bankStatementId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public String getChequeId() {
		return chequeId;
	}

	public void setChequeId(String chequeId) {
		this.chequeId = chequeId;
	}

	public BigDecimal getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(BigDecimal withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public BigDecimal getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	public int getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(int settlementId) {
		this.settlementId = settlementId;
	}

	public int getSettlementTypeId() {
		return settlementTypeId;
	}

	public void setSettlementTypeId(int settlementTypeId) {
		this.settlementTypeId = settlementTypeId;
	}

	
}
