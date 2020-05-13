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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "USER_ID", nullable = false)
	@JsonProperty("user_id")
    private String userId = "";

    @Column(name = "USER_TYPE", nullable = false)
	@JsonProperty("user_type")
    private String userType = "";

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
	@JsonProperty("account_number")
    private String accountNumber = "";

    @Column(name = "ACCOUNT_NAME", nullable = false)
	@JsonProperty("account_name")
    private String accountName = "";

    @Column(name = "IFSC_CODE", nullable = false)
	@JsonProperty("ifsc_code")
    private String ifscCode = "";

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("transaction_id")
    private String transactionId;

    @Column(name = "AMOUNT", nullable = false)
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "VERIFICATION_MODE", nullable = false)
	@JsonProperty("verification_mode")
    private String verificationMode = "";

    @Column(name = "TRANSACTION_STATUS")
	@JsonProperty("transaction_status")
    private String transactionStatus;

    @Column(name = "STATUS", nullable = false)
	@JsonProperty("status")
    private String STATUS = "";

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    
}