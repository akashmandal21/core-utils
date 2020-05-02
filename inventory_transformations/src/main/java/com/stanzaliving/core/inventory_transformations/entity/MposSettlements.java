package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "MPOS_SETTLEMENTS")
@Entity
public class MposSettlements implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "MPOS_ID", nullable = false)
    private Integer mposId;

    @Column(name = "DATE")
    private LocalDateTime DATE;

    @Column(name = "MOBILE")
    private String MOBILE;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "USER")
    private String USER;

    @Column(name = "USERNAME")
    private String USERNAME;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "MODE")
    private String MODE;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "TIP")
    private Double TIP;

    @Column(name = "CASHBACK")
    private Double CASHBACK;

    @Column(name = "TXN_TYPE")
    private String txnType;

    @Column(name = "AUTH_CODE")
    private String authCode;

    @Column(name = "CARD")
    private String CARD;

    @Column(name = "CARD_TYPE")
    private String cardType;

    @Column(name = "BRAND_TYPE")
    private String brandType;

    @Column(name = "CARD_TXN_TYPE")
    private String cardTxnType;

    @Column(name = "RRN")
    private String RRN;

    @Column(name = "INVOICE_NO")
    private String invoiceNo;

    @Column(name = "DEVICE")
    private String DEVICE;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "SETTLED_ON")
    private LocalDateTime settledOn;

    @Column(name = "LABEL")
    private String LABEL;

    @Column(name = "MID")
    private String MID;

    @Column(name = "TID")
    private String TID;

    @Column(name = "BATCH_ID")
    private String batchId;

    @Column(name = "REF_1")
    private String ref1;

    @Column(name = "ADDITIONAL_INFORMATION")
    private String additionalInformation;

    @Column(name = "PAYER")
    private String PAYER;

    @Column(name = "TID_LOCATION")
    private String tidLocation;

    @Column(name = "TRANSACTION_STATUS")
    private String transactionStatus;

    
}