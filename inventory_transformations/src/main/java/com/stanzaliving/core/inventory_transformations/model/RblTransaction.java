package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RBL_TRANSACTION")
public class RblTransaction {
	@Id
	private int id;

	@JoinColumn(name = "TRANSACTION_ID")
	@OneToOne(fetch = FetchType.EAGER)
	@MapsId
	private Transaction transaction;
	
	@Column(name="MESSAGE_TYPE")
	private String msgType;
	
	@Column(name="AMOUNT")
	private double amount;

	@Column(name="UTR_NUMBER")
	private String utrNumber;

	@Column(name="SENDER_IFSC")
	private String senderIFSC;

	@Column(name="SENDER_ACCOUNT_NUMBER")
	private String senderAccountNumber;

	@Column(name="SENDER_ACCOUNT_TYPE")
	private String senderAccountType;

	@Column(name="SENDER_NAME")
	private String senderName;

	@Column(name="BENEFICIARY_ACCOUNT_TYPE")
	private String beneficiaryAccountType;

	@Column(name="BENEFICIARY_ACCOUNT_NUMBER")
	private String beneficiaryAccountNumber;

	@Column(name="CREDIT_DATE")
	private Date creditDate;

	@Column(name="CREDIT_ACCOUNT_NUMBER")
	private String creditAccountNumber;

	@Column(name="CORPORATE_CODE")
	private String corporateCode;

	@Column(name="CLIENT_CODE")
	private String clientCodeMaster;

	@Column(name="SENDER_INFORMATION")
	private String senderInformation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getUtrNumber() {
		return utrNumber;
	}

	public void setUtrNumber(String utrNumber) {
		this.utrNumber = utrNumber;
	}

	public String getSenderIFSC() {
		return senderIFSC;
	}

	public void setSenderIFSC(String senderIFSC) {
		this.senderIFSC = senderIFSC;
	}

	public String getSenderAccountNumber() {
		return senderAccountNumber;
	}

	public void setSenderAccountNumber(String senderAccountNumber) {
		this.senderAccountNumber = senderAccountNumber;
	}

	public String getSenderAccountType() {
		return senderAccountType;
	}

	public void setSenderAccountType(String senderAccountType) {
		this.senderAccountType = senderAccountType;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getBeneficiaryAccountType() {
		return beneficiaryAccountType;
	}

	public void setBeneficiaryAccountType(String beneficiaryAccountType) {
		this.beneficiaryAccountType = beneficiaryAccountType;
	}

	public String getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public Date getCreditDate() {
		return creditDate;
	}

	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}

	public String getCreditAccountNumber() {
		return creditAccountNumber;
	}

	public void setCreditAccountNumber(String creditAccountNumber) {
		this.creditAccountNumber = creditAccountNumber;
	}

	public String getCorporateCode() {
		return corporateCode;
	}

	public void setCorporateCode(String corporateCode) {
		this.corporateCode = corporateCode;
	}

	public String getClientCodeMaster() {
		return clientCodeMaster;
	}

	public void setClientCodeMaster(String clientCodeMaster) {
		this.clientCodeMaster = clientCodeMaster;
	}

	public String getSenderInformation() {
		return senderInformation;
	}

	public void setSenderInformation(String senderInformation) {
		this.senderInformation = senderInformation;
	}

}
