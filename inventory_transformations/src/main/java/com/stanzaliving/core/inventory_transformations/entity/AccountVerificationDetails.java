package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACCOUNT_VERIFICATION_DETAILS")
@Data
public class AccountVerificationDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "USER_ID", nullable = false)
    private String userId = "";

    @Column(name = "USER_TYPE", nullable = false)
    private String userType = "";

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber = "";

    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String accountName = "";

    @Column(name = "IFSC_CODE", nullable = false)
    private String ifscCode = "";

    @Column(name = "TRANSACTION_ID")
    private String transactionId;

    @Column(name = "AMOUNT", nullable = false)
    private Double AMOUNT;

    @Column(name = "VERIFICATION_MODE", nullable = false)
    private String verificationMode = "";

    @Column(name = "TRANSACTION_STATUS")
    private String transactionStatus;

    @Column(name = "STATUS", nullable = false)
    private String STATUS = "";

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}