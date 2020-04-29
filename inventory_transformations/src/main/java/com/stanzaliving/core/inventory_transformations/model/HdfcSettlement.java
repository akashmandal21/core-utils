package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="HDFC_SETTLEMENT")
public class HdfcSettlement {
	
	@Id()
	@GeneratedValue
	@Column(name="SETTLEMENT_ID", nullable=false)
	private int settlementId;
	
	@Column(name = "BANK_STATEMENT_ID", nullable=false)
	private Integer bankStatementId;
	
	@Column(name = "TRANSACTION_DATE")
	private Date transactionDate;
	
	@Column(name = "VALUE_DATE")
	private Date valueDate;
	
	@Column(name="TRANSACTION_AMOUNT")
	private BigDecimal transactionAmount;
	
	@Column(name="DEBIT_CREDIT")
	private String debitCredit;
	
	@Column(name="TRANSACTION_DESCRIPTION")
	private String transactionDescription;
	
	@Column(name="REFERENCE_NUMBER", nullable=false)
	private String referenceNumber;
	
	@Column(name="TRANSACTION_BRANCH", nullable=false)
	private String transactionBranch;
	
	@Column(name="SETTLEMENT_TYPE_ID", nullable = false, columnDefinition = "int default 0")
	private int settlementTypeId;
	
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

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getDebitCredit() {
		return debitCredit;
	}

	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getTransactionBranch() {
		return transactionBranch;
	}

	public void setTransactionBranch(String transactionBranch) {
		this.transactionBranch = transactionBranch;
	}

}
