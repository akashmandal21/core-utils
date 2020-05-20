package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "ONGOING_FORFEITURE_DEDUCTION")
@Entity
@Data
public class OngoingForfeitureDeductionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "BOOKING_ID", nullable = false)
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "ONBOARDED", nullable = false)
	@JsonProperty("ONBOARDED")
    private Integer ONBOARDED = 0;

    @Column(name = "CONTRACT_END_DATE")
	@JsonProperty("CONTRACT_END_DATE")
    private Timestamp contractEndDate;

    @Column(name = "CANCELLED_DATE")
	@JsonProperty("CANCELLED_DATE")
    private Timestamp cancelledDate;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
	@JsonProperty("TOTAL_AMOUNT")
    private Double totalAmount = 0D;

    @Column(name = "REMAINING_AMOUNT", nullable = false)
	@JsonProperty("REMAINING_AMOUNT")
    private Double remainingAmount = 0D;

    @Column(name = "SECURITY_DEPOSIT_AMOUNT", nullable = false)
	@JsonProperty("SECURITY_DEPOSIT_AMOUNT")
    private Double securityDepositAmount = 0D;

    @Column(name = "ADVENCE_RENTAL_AMOUNT", nullable = false)
	@JsonProperty("ADVENCE_RENTAL_AMOUNT")
    private Double advenceRentalAmount = 0D;

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

    @Column(name = "BOOKING_TYPE", nullable = false)
	@JsonProperty("BOOKING_TYPE")
    private Integer bookingType = 0;

    
}