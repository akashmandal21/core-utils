package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "BROKER_ACCOUNT")
@Data
public class BrokerAccountEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BROKER_ID", nullable = false)
	@JsonProperty("broker_id")
    private Integer brokerId;

    @Column(name = "ACCOUNT_NAME", nullable = false)
	@JsonProperty("account_name")
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
	@JsonProperty("account_number")
    private String accountNumber;

    @Column(name = "ACTIVE", nullable = false)
	@JsonProperty("active")
    private Boolean ACTIVE;

    @Column(name = "BANK_NAME", nullable = false)
	@JsonProperty("bank_name")
    private String bankName;

    @Column(name = "IFSC_CODE", nullable = false)
	@JsonProperty("ifsc_code")
    private String ifscCode;

    @Column(name = "RAZORPAYX_ID")
	@JsonProperty("razorpayx_id")
    private String razorpayxId;

    @Column(name = "VPA")
	@JsonProperty("vpa")
    private String VPA;

    @Column(name = "RAZORPAYX_BANK_ACCOUNT_ID")
	@JsonProperty("razorpayx_bank_account_id")
    private String razorpayxBankAccountId;

    @Column(name = "RAZORPAYX_VPA_ACCOUNT_ID")
	@JsonProperty("razorpayx_vpa_account_id")
    private String razorpayxVpaAccountId;

    @Column(name = "VERIFIED", nullable = false)
	@JsonProperty("verified")
    private Boolean VERIFIED = Boolean.FALSE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    
}