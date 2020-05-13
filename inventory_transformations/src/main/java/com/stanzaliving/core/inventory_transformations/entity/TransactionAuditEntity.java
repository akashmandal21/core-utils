package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "TRANSACTION_AUDIT")
@Entity
public class TransactionAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_AUDIT_ID", insertable = false, nullable = false)
	@JsonProperty("transaction_audit_id")
    private Integer transactionAuditId;

    @Column(name = "AMOUNT")
	@JsonProperty("amount")
    private Double AMOUNT;

    @Column(name = "GATEWAY_TRANCATION_ID1")
	@JsonProperty("gateway_trancation_id1")
    private String gatewayTrancationId1;

    @Column(name = "STATUS")
	@JsonProperty("status")
    private String STATUS;

    @Column(name = "TRANSACTION_DATE", nullable = false)
	@JsonProperty("transaction_date")
    private Timestamp transactionDate;

    @Column(name = "PAYMENT_MODE_ID")
	@JsonProperty("payment_mode_id")
    private Integer paymentModeId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "RECEIPT_ID")
	@JsonProperty("receipt_id")
    private String receiptId;

    @Column(name = "TEMPORARY_STUDENT_ID")
	@JsonProperty("temporary_student_id")
    private Integer temporaryStudentId;

    @Column(name = "GATEWAY_TRANSACTION_ID")
	@JsonProperty("gateway_transaction_id")
    private String gatewayTransactionId;

    @Column(name = "COMPLETION_DATE")
	@JsonProperty("completion_date")
    private Timestamp completionDate;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "TRANSACTION_TYPE")
	@JsonProperty("transaction_type")
    private String transactionType = "BOOKING";

    @Column(name = "ADDED_DATE")
	@JsonProperty("added_date")
    private Timestamp addedDate;

    @Column(name = "TRANSACTION_ID")
	@JsonProperty("transaction_id")
    private Integer transactionId;

    
}