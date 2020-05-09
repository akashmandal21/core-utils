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
public class PENALTYEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STUDENT_ID", insertable = false, nullable = false)
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

    @Column(name = "STATUS", nullable = false)
	@JsonProperty("STATUS")
    private Boolean STATUS = Boolean.FALSE;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "PER_DAY_PENALTY", nullable = false)
	@JsonProperty("PER_DAY_PENALTY")
    private Double perDayPenalty = 0D;

    @Column(name = "DUE_DATE", nullable = false)
	@JsonProperty("DUE_DATE")
    private Timestamp dueDate;

    
}