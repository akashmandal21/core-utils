package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "ACCOUNT_VERIFICATION_DETAILS")
@Entity
@Data
public class AccountVerificationDetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "USER_ID", nullable = false)
	@JsonProperty("USER_ID")
    private String userId = "";

    @Column(name = "USER_TYPE", nullable = false)
	@JsonProperty("USER_TYPE")
    private String userType = "";

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
	@JsonProperty("ACCOUNT_NUMBER")
    private String accountNumber = "";

    @Column(name = "ACCOUNT_NAME", nullable = false)
	@JsonProperty("ACCOUNT_NAME")
    private String accountName = "";

    @Column(name = "IFSC_CODE", nullable = false)
	@JsonProperty("IFSC_CODE")
    private String ifscCode = "";

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("TRANSACTION_ID")
    private String transactionId;

    @Column(name = "AMOUNT", nullable = false)
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "VERIFICATION_MODE", nullable = false)
	@JsonProperty("VERIFICATION_MODE")
    private String verificationMode = "";

    @Column(name = "TRANSACTION_STATUS")
	@JsonProperty("TRANSACTION_STATUS")
    private String transactionStatus;

    @Column(name = "STATUS", nullable = false)
	@JsonProperty("STATUS")
    private String STATUS = "";

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}