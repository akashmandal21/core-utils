package com.stanzaliving.core.inventory_transformations.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ACCOUNT_VERIFICATION_DETAILS")
public class AccountVerificationDetails {

	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="USER_TYPE")
	private String userType;
	
	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;
	
	@Column(name="ACCOUNT_NAME")
	private String accountName;	
	
	@Column(name="IFSC_CODE")
	private String ifscCode;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@Column(name="VERIFICATION_MODE")
	private String verificationMode;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="TRANSACTION_STATUS")
	private String transactionStatus;
	
}
