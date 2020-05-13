package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "TRANSACTION")
@Data
public class TransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID", insertable = false, nullable = false)
	@JsonProperty("transaction_id")
    private Integer transactionId;

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
    private String transactionType;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "PAYMENT_TRANSACTION_ID")
	@JsonProperty("payment_transaction_id")
    private Long paymentTransactionId;

    @Column(name = "PARENT_COMPANY", nullable = false)
	@JsonProperty("parent_company")
    private Integer parentCompany;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    
}