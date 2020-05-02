package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "BROKER_ACCOUNT")
public class BrokerAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BROKER_ID", nullable = false)
    private Integer brokerId;

    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean ACTIVE;

    @Column(name = "BANK_NAME", nullable = false)
    private String bankName;

    @Column(name = "IFSC_CODE", nullable = false)
    private String ifscCode;

    @Column(name = "RAZORPAYX_ID")
    private String razorpayxId;

    @Column(name = "VPA")
    private String VPA;

    @Column(name = "RAZORPAYX_BANK_ACCOUNT_ID")
    private String razorpayxBankAccountId;

    @Column(name = "RAZORPAYX_VPA_ACCOUNT_ID")
    private String razorpayxVpaAccountId;

    @Column(name = "VERIFIED", nullable = false)
    private Boolean VERIFIED = Boolean.FALSE;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}