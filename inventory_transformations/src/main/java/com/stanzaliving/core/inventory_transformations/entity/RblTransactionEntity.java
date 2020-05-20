package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "RBL_TRANSACTION")
public class RblTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "MESSAGE_TYPE")
	@JsonProperty("MESSAGE_TYPE")
    private String messageType;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "UTR_NUMBER")
	@JsonProperty("UTR_NUMBER")
    private String utrNumber;

    @Column(name = "SENDER_IFSC")
	@JsonProperty("SENDER_IFSC")
    private String senderIfsc;

    @Column(name = "SENDER_ACCOUNT_NUMBER")
	@JsonProperty("SENDER_ACCOUNT_NUMBER")
    private String senderAccountNumber;

    @Column(name = "SENDER_ACCOUNT_TYPE")
	@JsonProperty("SENDER_ACCOUNT_TYPE")
    private String senderAccountType;

    @Column(name = "SENDER_NAME")
	@JsonProperty("SENDER_NAME")
    private String senderName;

    @Column(name = "BENEFICIARY_ACCOUNT_TYPE")
	@JsonProperty("BENEFICIARY_ACCOUNT_TYPE")
    private String beneficiaryAccountType;

    @Column(name = "BENEFICIARY_ACCOUNT_NUMBER")
	@JsonProperty("BENEFICIARY_ACCOUNT_NUMBER")
    private String beneficiaryAccountNumber;

    @Column(name = "CREDIT_DATE")
	@JsonProperty("CREDIT_DATE")
    private Timestamp creditDate;

    @Column(name = "CREDIT_ACCOUNT_NUMBER")
	@JsonProperty("CREDIT_ACCOUNT_NUMBER")
    private String creditAccountNumber;

    @Column(name = "CORPORATE_CODE")
	@JsonProperty("CORPORATE_CODE")
    private String corporateCode;

    @Column(name = "CLIENT_CODE")
	@JsonProperty("CLIENT_CODE")
    private String clientCode;

    @Column(name = "SENDER_INFORMATION")
	@JsonProperty("SENDER_INFORMATION")
    private String senderInformation;

    
}