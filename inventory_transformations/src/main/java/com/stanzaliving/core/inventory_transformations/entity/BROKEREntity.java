package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "BROKER")
public class BROKEREntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "GST_CERTIFICATE_UPLOADED")
	@JsonProperty("GST_CERTIFICATE_UPLOADED")
    private Boolean gstCertificateUploaded;

    @Column(name = "GST_UPLOADED")
	@JsonProperty("GST_UPLOADED")
    private Boolean gstUploaded;

    @Column(name = "CANCELLED_CHEQUE_UPLOADED")
	@JsonProperty("CANCELLED_CHEQUE_UPLOADED")
    private Boolean cancelledChequeUploaded;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "CREATED_BY", nullable = false)
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "EMAIL")
	@JsonProperty("EMAIL")
    private String EMAIL;

    @Column(name = "GST")
	@JsonProperty("GST")
    private String GST;

    @Column(name = "MOBILE", nullable = false)
	@JsonProperty("MOBILE")
    private String MOBILE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "PAN_CARD")
	@JsonProperty("PAN_CARD")
    private String panCard;

    @Column(name = "PAN_CARD_UPLOADED")
	@JsonProperty("PAN_CARD_UPLOADED")
    private Boolean panCardUploaded;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "TOTAL_CLOSURE")
	@JsonProperty("TOTAL_CLOSURE")
    private Integer totalClosure;

    @Column(name = "TOTAL_EARNINGS")
	@JsonProperty("TOTAL_EARNINGS")
    private Integer totalEarnings;

    @Column(name = "TOTAL_LEADS")
	@JsonProperty("TOTAL_LEADS")
    private Integer totalLeads;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "BROKER_SLAB_ID")
	@JsonProperty("BROKER_SLAB_ID")
    private Integer brokerSlabId;

    @Column(name = "BROKER_TYPE_ID")
	@JsonProperty("BROKER_TYPE_ID")
    private Integer brokerTypeId;

    @Column(name = "CREATED_BY_NAME", nullable = false)
	@JsonProperty("CREATED_BY_NAME")
    private String createdByName;

    @Column(name = "CREATED_BY_PHONE", nullable = false)
	@JsonProperty("CREATED_BY_PHONE")
    private String createdByPhone;

    @Column(name = "USER_ID")
	@JsonProperty("USER_ID")
    private String userId;

    @Column(name = "ENABLED")
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "REFERRER_PAYMENT_METHOD")
	@JsonProperty("REFERRER_PAYMENT_METHOD")
    private String referrerPaymentMethod;

    @Column(name = "REFERRER_PAYTM_NUMBER")
	@JsonProperty("REFERRER_PAYTM_NUMBER")
    private String referrerPaytmNumber;

    @Column(name = "PREFERRED_PAYMENT_MODE")
	@JsonProperty("PREFERRED_PAYMENT_MODE")
    private Integer preferredPaymentMode;

    @Column(name = "PAYTM_NUMBER")
	@JsonProperty("PAYTM_NUMBER")
    private String paytmNumber;

    @Column(name = "UUID")
	@JsonProperty("UUID")
    private String UUID;

    @Column(name = "BROKER_QR_CODE")
	@JsonProperty("BROKER_QR_CODE")
    private String brokerQrCode;

    
}