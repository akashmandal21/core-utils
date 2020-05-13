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
	@JsonProperty("transaction_id")
    private Integer transactionId;

    @Column(name = "MESSAGE_TYPE")
	@JsonProperty("message_type")
    private String messageType;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "UTR_NUMBER")
	@JsonProperty("utr_number")
    private String utrNumber;

    @Column(name = "SENDER_IFSC")
	@JsonProperty("sender_ifsc")
    private String senderIfsc;

    @Column(name = "SENDER_ACCOUNT_NUMBER")
	@JsonProperty("sender_account_number")
    private String senderAccountNumber;

    @Column(name = "SENDER_ACCOUNT_TYPE")
	@JsonProperty("sender_account_type")
    private String senderAccountType;

    @Column(name = "SENDER_NAME")
	@JsonProperty("sender_name")
    private String senderName;

    @Column(name = "BENEFICIARY_ACCOUNT_TYPE")
	@JsonProperty("beneficiary_account_type")
    private String beneficiaryAccountType;

    @Column(name = "BENEFICIARY_ACCOUNT_NUMBER")
	@JsonProperty("beneficiary_account_number")
    private String beneficiaryAccountNumber;

    @Column(name = "CREDIT_DATE")
	@JsonProperty("credit_date")
    private Timestamp creditDate;

    @Column(name = "CREDIT_ACCOUNT_NUMBER")
	@JsonProperty("credit_account_number")
    private String creditAccountNumber;

    @Column(name = "CORPORATE_CODE")
	@JsonProperty("corporate_code")
    private String corporateCode;

    @Column(name = "CLIENT_CODE")
	@JsonProperty("client_code")
    private String clientCode;

    @Column(name = "SENDER_INFORMATION")
	@JsonProperty("sender_information")
    private String senderInformation;

    
}