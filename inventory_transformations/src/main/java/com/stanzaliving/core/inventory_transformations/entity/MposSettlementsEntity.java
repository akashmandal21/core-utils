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
	@JsonProperty("MPOS_ID")
    private Integer mposId;

    @Column(name = "DATE")
	@JsonProperty("DATE")
    private Timestamp DATE;

    @Column(name = "MOBILE")
	@JsonProperty("MOBILE")
    private String MOBILE;

    @Column(name = "EMAIL")
	@JsonProperty("EMAIL")
    private String EMAIL;

    @Column(name = "USER")
	@JsonProperty("USER")
    private String USER;

    @Column(name = "USERNAME")
	@JsonProperty("USERNAME")
    private String USERNAME;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "MODE")
	@JsonProperty("MODE")
    private String MODE;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "TIP")
	@JsonProperty("TIP")
    private Double TIP;

    @Column(name = "CASHBACK")
	@JsonProperty("CASHBACK")
    private Double CASHBACK;

    @Column(name = "TXN_TYPE")
	@JsonProperty("TXN_TYPE")
    private String txnType;

    @Column(name = "AUTH_CODE")
	@JsonProperty("AUTH_CODE")
    private String authCode;

    @Column(name = "CARD")
	@JsonProperty("CARD")
    private String CARD;

    @Column(name = "CARD_TYPE")
	@JsonProperty("CARD_TYPE")
    private String cardType;

    @Column(name = "BRAND_TYPE")
	@JsonProperty("BRAND_TYPE")
    private String brandType;

    @Column(name = "CARD_TXN_TYPE")
	@JsonProperty("CARD_TXN_TYPE")
    private String cardTxnType;

    @Column(name = "RRN")
	@JsonProperty("RRN")
    private String RRN;

    @Column(name = "INVOICE_NO")
	@JsonProperty("INVOICE_NO")
    private String invoiceNo;

    @Column(name = "DEVICE")
	@JsonProperty("DEVICE")
    private String DEVICE;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "SETTLED_ON")
	@JsonProperty("SETTLED_ON")
    private Timestamp settledOn;

    @Column(name = "LABEL")
	@JsonProperty("LABEL")
    private String LABEL;

    @Column(name = "MID")
	@JsonProperty("MID")
    private String MID;

    @Column(name = "TID")
	@JsonProperty("TID")
    private String TID;

    @Column(name = "BATCH_ID")
	@JsonProperty("BATCH_ID")
    private String batchId;

    @Column(name = "REF_1")
	@JsonProperty("REF_1")
    private String ref1;

    @Column(name = "ADDITIONAL_INFORMATION", columnDefinition = "text")
	@JsonProperty("ADDITIONAL_INFORMATION")
    private String additionalInformation;

    @Column(name = "PAYER")
	@JsonProperty("PAYER")
    private String PAYER;

    @Column(name = "TID_LOCATION")
	@JsonProperty("TID_LOCATION")
    private String tidLocation;

    @Column(name = "TRANSACTION_STATUS")
	@JsonProperty("TRANSACTION_STATUS")
    private String transactionStatus;

    
}