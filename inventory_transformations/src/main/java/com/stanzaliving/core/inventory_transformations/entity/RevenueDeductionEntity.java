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
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "ONBOARDED", nullable = false)
	@JsonProperty("onboarded")
    private Integer ONBOARDED = 0;

    @Column(name = "CONTRACT_START_DATE")
	@JsonProperty("contract_start_date")
    private Date contractStartDate;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
	@JsonProperty("total_amount")
    private Double totalAmount = 0D;

    @Column(name = "REMAINING_AMOUNT", nullable = false)
	@JsonProperty("remaining_amount")
    private Double remainingAmount = 0D;

    @Column(name = "ONE_DAY_RENT", nullable = false)
	@JsonProperty("one_day_rent")
    private Double oneDayRent = 0D;

    @Column(name = "DEDUCTIONS_MADE", nullable = false)
	@JsonProperty("deductions_made")
    private Integer deductionsMade = 0;

    @Column(name = "CREATED_AT", nullable = false)
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "METADATA", columnDefinition = "json")
	@JsonProperty("metadata")
    private String METADATA;

    
}