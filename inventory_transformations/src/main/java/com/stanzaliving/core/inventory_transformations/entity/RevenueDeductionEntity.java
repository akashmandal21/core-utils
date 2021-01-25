package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "REVENUE_DEDUCTION")
@Data
@Entity
public class RevenueDeductionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "ONBOARDED", nullable = false)
	@JsonProperty("ONBOARDED")
    private Integer ONBOARDED = 0;

    @Column(name = "CONTRACT_START_DATE")
	@JsonProperty("CONTRACT_START_DATE")
    private Date contractStartDate;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
	@JsonProperty("TOTAL_AMOUNT")
    private Double totalAmount = 0D;

    @Column(name = "REMAINING_AMOUNT", nullable = false)
	@JsonProperty("REMAINING_AMOUNT")
    private Double remainingAmount = 0D;

    @Column(name = "ONE_DAY_RENT", nullable = false)
	@JsonProperty("ONE_DAY_RENT")
    private Double oneDayRent = 0D;

    @Column(name = "DEDUCTIONS_MADE", nullable = false)
	@JsonProperty("DEDUCTIONS_MADE")
    private Integer deductionsMade = 0;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("METADATA")
    private String METADATA;

    
}