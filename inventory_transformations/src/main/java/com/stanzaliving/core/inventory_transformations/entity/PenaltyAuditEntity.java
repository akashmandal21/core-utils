package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "PENALTY_AUDIT")
@Data
public class PenaltyAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PENALTY_AUDIT_ID", insertable = false, nullable = false)
	@JsonProperty("PENALTY_AUDIT_ID")
    private Integer penaltyAuditId;

    @Column(name = "STUDENT_ID")
	@JsonProperty("STUDENT_ID")
    private String studentId;

    @Column(name = "PENALTY_AMOUNT")
	@JsonProperty("PENALTY_AMOUNT")
    private Double penaltyAmount = 0D;

    @Column(name = "INVOICE_AMOUNT")
	@JsonProperty("INVOICE_AMOUNT")
    private Double invoiceAmount = 0D;

    @Column(name = "AMOUNT_PAID")
	@JsonProperty("AMOUNT_PAID")
    private Double amountPaid = 0D;

    @Column(name = "PENALTY_DAYS")
	@JsonProperty("PENALTY_DAYS")
    private Integer penaltyDays = 0;

    @Column(name = "STATUS")
	@JsonProperty("STATUS")
    private Boolean STATUS = Boolean.FALSE;

    @Column(name = "DUE_DATE", nullable = false)
	@JsonProperty("DUE_DATE")
    private Timestamp dueDate;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "PER_DAY_PENALTY", nullable = false)
	@JsonProperty("PER_DAY_PENALTY")
    private Double perDayPenalty = 0D;

    
}