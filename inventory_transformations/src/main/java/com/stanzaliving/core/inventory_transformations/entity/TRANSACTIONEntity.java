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
	@JsonProperty("TRANSACTION_ID")
    private Integer transactionId;

    @Column(name = "AMOUNT")
	@JsonProperty("AMOUNT")
    private Double AMOUNT;

    @Column(name = "GATEWAY_TRANCATION_ID1")
	@JsonProperty("GATEWAY_TRANCATION_ID1")
    private String gatewayTrancationId1;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private String STATUS;

    @Column(name = "TRANSACTION_DATE", nullable = false)
	@JsonProperty("TRANSACTION_DATE")
    private Timestamp transactionDate;

    @Column(name = "PAYMENT_MODE_ID")
	@JsonProperty("PAYMENT_MODE_ID")
    private Integer paymentModeId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "RECEIPT_ID")
	@JsonProperty("RECEIPT_ID")
    private String receiptId;

    @Column(name = "TEMPORARY_STUDENT_ID")
	@JsonProperty("TEMPORARY_STUDENT_ID")
    private Integer temporaryStudentId;

    @Column(name = "GATEWAY_TRANSACTION_ID")
	@JsonProperty("GATEWAY_TRANSACTION_ID")
    private String gatewayTransactionId;

    @Column(name = "COMPLETION_DATE")
	@JsonProperty("COMPLETION_DATE")
    private Timestamp completionDate;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "TRANSACTION_TYPE")
	@JsonProperty("TRANSACTION_TYPE")
    private String transactionType = "BOOKING";

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "PAYMENT_TRANSACTION_ID")
	@JsonProperty("PAYMENT_TRANSACTION_ID")
    private Long paymentTransactionId;

    @Column(name = "PARENT_COMPANY", nullable = false)
	@JsonProperty("PARENT_COMPANY")
    private Integer parentCompany = 0;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    
}