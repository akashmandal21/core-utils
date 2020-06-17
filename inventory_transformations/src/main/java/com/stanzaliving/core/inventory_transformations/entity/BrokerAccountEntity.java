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
@Table(name = "USER_BANK_ACCOUNT")
@Data
public class BrokerAccountEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue
    @Column(name="ID")
    private int id;

    //	@MapsId
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column(name="USER_ID")
    private String userId;

    @Column(name = "ACCOUNT_NAME", nullable = false)
	@JsonProperty("ACCOUNT_NAME")
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
	@JsonProperty("ACCOUNT_NUMBER")
    private String accountNumber;

    @Column(name = "ACTIVE", nullable = false)
	@JsonProperty("ACTIVE")
    private Boolean ACTIVE;

    @Column(name = "BANK_NAME", nullable = false)
	@JsonProperty("BANK_NAME")
    private String bankName;

    @Column(name = "IFSC_CODE", nullable = false)
	@JsonProperty("IFSC_CODE")
    private String ifscCode;

    @Column(name = "RAZORPAYX_ID")
	@JsonProperty("RAZORPAYX_ID")
    private String razorpayxId;

    @Column(name = "VPA")
	@JsonProperty("VPA")
    private String VPA;

    @Column(name = "RAZORPAYX_BANK_ACCOUNT_ID")
	@JsonProperty("RAZORPAYX_BANK_ACCOUNT_ID")
    private String razorpayxBankAccountId;

    @Column(name = "RAZORPAYX_VPA_ACCOUNT_ID")
	@JsonProperty("RAZORPAYX_VPA_ACCOUNT_ID")
    private String razorpayxVpaAccountId;

    @Column(name = "VERIFIED", nullable = false)
	@JsonProperty("VERIFIED")
    private Boolean VERIFIED = Boolean.FALSE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name="USER_TYPE")
    private String userType;

    
}