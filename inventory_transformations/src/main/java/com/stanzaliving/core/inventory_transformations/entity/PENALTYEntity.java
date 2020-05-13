package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "PENALTY")
@Data
public class PenaltyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
	@JsonProperty("student_id")
    private String studentId;

    @Column(name = "PENALTY_AMOUNT")
	@JsonProperty("penalty_amount")
    private Double penaltyAmount = 0D;

    @Column(name = "INVOICE_AMOUNT")
	@JsonProperty("invoice_amount")
    private Double invoiceAmount = 0D;

    @Column(name = "AMOUNT_PAID")
	@JsonProperty("amount_paid")
    private Double amountPaid = 0D;

    @Column(name = "PENALTY_DAYS")
	@JsonProperty("penalty_days")
    private Integer penaltyDays = 0;

    @Column(name = "STATUS", nullable = false)
	@JsonProperty("status")
    private Boolean STATUS = Boolean.FALSE;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "PER_DAY_PENALTY", nullable = false)
	@JsonProperty("per_day_penalty")
    private Double perDayPenalty = 0D;

    @Column(name = "DUE_DATE", nullable = false)
	@JsonProperty("due_date")
    private Timestamp dueDate;

    
}