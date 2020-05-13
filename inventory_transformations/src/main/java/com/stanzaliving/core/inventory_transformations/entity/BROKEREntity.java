package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "BROKER")
public class BrokerEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "GST_CERTIFICATE_UPLOADED")
	@JsonProperty("gst_certificate_uploaded")
    private Boolean gstCertificateUploaded;

    @Column(name = "GST_UPLOADED")
	@JsonProperty("gst_uploaded")
    private Boolean gstUploaded;

    @Column(name = "CANCELLED_CHEQUE_UPLOADED")
	@JsonProperty("cancelled_cheque_uploaded")
    private Boolean cancelledChequeUploaded;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "CREATED_BY", nullable = false)
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "EMAIL")
	@JsonProperty("email")
    private String EMAIL;

    @Column(name = "GST")
	@JsonProperty("gst")
    private String GST;

    @Column(name = "MOBILE", nullable = false)
	@JsonProperty("mobile")
    private String MOBILE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "PAN_CARD")
	@JsonProperty("pan_card")
    private String panCard;

    @Column(name = "PAN_CARD_UPLOADED")
	@JsonProperty("pan_card_uploaded")
    private Boolean panCardUploaded;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "TOTAL_CLOSURE")
	@JsonProperty("total_closure")
    private Integer totalClosure;

    @Column(name = "TOTAL_EARNINGS")
	@JsonProperty("total_earnings")
    private Integer totalEarnings;

    @Column(name = "TOTAL_LEADS")
	@JsonProperty("total_leads")
    private Integer totalLeads;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "BROKER_SLAB_ID")
	@JsonProperty("broker_slab_id")
    private Integer brokerSlabId;

    @Column(name = "BROKER_TYPE_ID")
	@JsonProperty("broker_type_id")
    private Integer brokerTypeId;

    @Column(name = "CREATED_BY_NAME", nullable = false)
	@JsonProperty("created_by_name")
    private String createdByName;

    @Column(name = "CREATED_BY_PHONE", nullable = false)
	@JsonProperty("created_by_phone")
    private String createdByPhone;

    @Column(name = "USER_ID")
	@JsonProperty("user_id")
    private String userId;

    @Column(name = "ENABLED")
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "REFERRER_PAYMENT_METHOD")
	@JsonProperty("referrer_payment_method")
    private String referrerPaymentMethod;

    @Column(name = "REFERRER_PAYTM_NUMBER")
	@JsonProperty("referrer_paytm_number")
    private String referrerPaytmNumber;

    @Column(name = "PREFERRED_PAYMENT_MODE")
	@JsonProperty("preferred_payment_mode")
    private Integer preferredPaymentMode;

    @Column(name = "PAYTM_NUMBER")
	@JsonProperty("paytm_number")
    private String paytmNumber;

    @Column(name = "UUID")
	@JsonProperty("uuid")
    private String UUID;

    @Column(name = "BROKER_QR_CODE")
	@JsonProperty("broker_qr_code")
    private String brokerQrCode;

    
}