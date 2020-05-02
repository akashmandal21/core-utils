package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "BROKER")
@Data
public class BROKER implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "GST_CERTIFICATE_UPLOADED")
    private Boolean gstCertificateUploaded;

    @Column(name = "GST_UPLOADED")
    private Boolean gstUploaded;

    @Column(name = "CANCELLED_CHEQUE_UPLOADED")
    private Boolean cancelledChequeUploaded;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    @Column(name = "EMAIL")
    private String EMAIL;

    @Column(name = "GST")
    private String GST;

    @Column(name = "MOBILE", nullable = false)
    private String MOBILE;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "PAN_CARD")
    private String panCard;

    @Column(name = "PAN_CARD_UPLOADED")
    private Boolean panCardUploaded;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "TOTAL_CLOSURE")
    private Integer totalClosure;

    @Column(name = "TOTAL_EARNINGS")
    private Integer totalEarnings;

    @Column(name = "TOTAL_LEADS")
    private Integer totalLeads;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "BROKER_SLAB_ID")
    private Integer brokerSlabId;

    @Column(name = "BROKER_TYPE_ID")
    private Integer brokerTypeId;

    @Column(name = "CREATED_BY_NAME", nullable = false)
    private String createdByName;

    @Column(name = "CREATED_BY_PHONE", nullable = false)
    private String createdByPhone;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "ENABLED")
    private Boolean ENABLED;

    @Column(name = "REFERRER_PAYMENT_METHOD")
    private String referrerPaymentMethod;

    @Column(name = "REFERRER_PAYTM_NUMBER")
    private String referrerPaytmNumber;

    @Column(name = "PREFERRED_PAYMENT_MODE")
    private Integer preferredPaymentMode;

    @Column(name = "PAYTM_NUMBER")
    private String paytmNumber;

    @Column(name = "UUID")
    private String UUID;

    @Column(name = "BROKER_QR_CODE")
    private String brokerQrCode;

    
}