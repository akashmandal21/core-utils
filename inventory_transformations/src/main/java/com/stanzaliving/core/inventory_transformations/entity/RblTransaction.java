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
@Table(name = "RBL_TRANSACTION")
public class RblTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
    private Integer transactionId;

    @Column(name = "MESSAGE_TYPE")
    private String messageType;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "UTR_NUMBER")
    private String utrNumber;

    @Column(name = "SENDER_IFSC")
    private String senderIfsc;

    @Column(name = "SENDER_ACCOUNT_NUMBER")
    private String senderAccountNumber;

    @Column(name = "SENDER_ACCOUNT_TYPE")
    private String senderAccountType;

    @Column(name = "SENDER_NAME")
    private String senderName;

    @Column(name = "BENEFICIARY_ACCOUNT_TYPE")
    private String beneficiaryAccountType;

    @Column(name = "BENEFICIARY_ACCOUNT_NUMBER")
    private String beneficiaryAccountNumber;

    @Column(name = "CREDIT_DATE")
    private LocalDateTime creditDate;

    @Column(name = "CREDIT_ACCOUNT_NUMBER")
    private String creditAccountNumber;

    @Column(name = "CORPORATE_CODE")
    private String corporateCode;

    @Column(name = "CLIENT_CODE")
    private String clientCode;

    @Column(name = "SENDER_INFORMATION")
    private String senderInformation;

    
}