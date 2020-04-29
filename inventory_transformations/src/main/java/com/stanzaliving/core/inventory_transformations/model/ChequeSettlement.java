package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CHEQUE_SETTLEMENT")
public class ChequeSettlement {

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
	
	@Column(name="BANK_REF_NO")
	private String bankRefNo;
	
	@Column(name="NARRATION", nullable=false)
	private String naration;
	
	@Column(name="CHEQUE_NO", nullable=false)
	private String chequeNumber;
	
	@Column(name="BANK_CODE", nullable=false)
	private String bankCode;
	
	@Column(name="BANK_BRANCH_NAME", nullable=false)
	private String bankBranchName;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="DEBIT")
	private BigDecimal debit;
	
	@Column(name="CREDIT")
	private BigDecimal credit;
	
	@Column(name="SETTLEMENT_TYPE_ID", nullable = false, columnDefinition = "int default 0")
	private int settlementTypeId;

	public int getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(int settlementId) {
		this.settlementId = settlementId;
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

	public String getBankRefNo() {
		return bankRefNo;
	}

	public void setBankRefNo(String bankRefNo) {
		this.bankRefNo = bankRefNo;
	}

	public String getNaration() {
		return naration;
	}

	public void setNaration(String naration) {
		this.naration = naration;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getDebit() {
		return debit;
	}

	public void setDebit(BigDecimal debit) {
		this.debit = debit;
	}

	public BigDecimal getCredit() {
		return credit;
	}

	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}

	public Integer getSettlementTypeId() {
		return settlementTypeId;
	}

	public void setSettlementTypeId(Integer settlementTypeId) {
		this.settlementTypeId = settlementTypeId;
	}
	
	
}
