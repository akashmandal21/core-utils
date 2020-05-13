package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "MPOS_SETTLEMENTS")
@Entity
@Data
public class MposSettlementsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "MPOS_ID", nullable = false)
	@JsonProperty("mpos_id")
    private Integer mposId;

    @Column(name = "DATE")
	@JsonProperty("date")
    private Timestamp DATE;

    @Column(name = "MOBILE")
	@JsonProperty("mobile")
    private String MOBILE;

    @Column(name = "EMAIL")
	@JsonProperty("email")
    private String EMAIL;

    @Column(name = "USER")
	@JsonProperty("user")
    private String USER;

    @Column(name = "USERNAME")
	@JsonProperty("username")
    private String USERNAME;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "MODE")
	@JsonProperty("mode")
    private String MODE;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "TIP")
	@JsonProperty("tip")
    private Double TIP;

    @Column(name = "CASHBACK")
	@JsonProperty("cashback")
    private Double CASHBACK;

    @Column(name = "TXN_TYPE")
	@JsonProperty("txn_type")
    private String txnType;

    @Column(name = "AUTH_CODE")
	@JsonProperty("auth_code")
    private String authCode;

    @Column(name = "CARD")
	@JsonProperty("card")
    private String CARD;

    @Column(name = "CARD_TYPE")
	@JsonProperty("card_type")
    private String cardType;

    @Column(name = "BRAND_TYPE")
	@JsonProperty("brand_type")
    private String brandType;

    @Column(name = "CARD_TXN_TYPE")
	@JsonProperty("card_txn_type")
    private String cardTxnType;

    @Column(name = "RRN")
	@JsonProperty("rrn")
    private String RRN;

    @Column(name = "INVOICE_NO")
	@JsonProperty("invoice_no")
    private String invoiceNo;

    @Column(name = "DEVICE")
	@JsonProperty("device")
    private String DEVICE;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "SETTLED_ON")
	@JsonProperty("settled_on")
    private Timestamp settledOn;

    @Column(name = "LABEL")
	@JsonProperty("label")
    private String LABEL;

    @Column(name = "MID")
	@JsonProperty("mid")
    private String MID;

    @Column(name = "TID")
	@JsonProperty("tid")
    private String TID;

    @Column(name = "BATCH_ID")
	@JsonProperty("batch_id")
    private String batchId;

    @Column(name = "REF_1")
	@JsonProperty("ref_1")
    private String ref1;

    @Column(name = "ADDITIONAL_INFORMATION", columnDefinition = "text")
	@JsonProperty("additional_information")
    private String additionalInformation;

    @Column(name = "PAYER")
	@JsonProperty("payer")
    private String PAYER;

    @Column(name = "TID_LOCATION")
	@JsonProperty("tid_location")
    private String tidLocation;

    @Column(name = "TRANSACTION_STATUS")
	@JsonProperty("transaction_status")
    private String transactionStatus;

    
}