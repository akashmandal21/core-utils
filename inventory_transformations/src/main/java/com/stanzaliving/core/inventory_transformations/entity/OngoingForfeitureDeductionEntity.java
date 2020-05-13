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
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("inventory_id")
    private Integer inventoryId;

    @Column(name = "ONBOARDED", nullable = false)
	@JsonProperty("onboarded")
    private Integer ONBOARDED = 0;

    @Column(name = "CONTRACT_END_DATE")
	@JsonProperty("contract_end_date")
    private Timestamp contractEndDate;

    @Column(name = "CANCELLED_DATE")
	@JsonProperty("cancelled_date")
    private Timestamp cancelledDate;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
	@JsonProperty("total_amount")
    private Double totalAmount = 0D;

    @Column(name = "REMAINING_AMOUNT", nullable = false)
	@JsonProperty("remaining_amount")
    private Double remainingAmount = 0D;

    @Column(name = "SECURITY_DEPOSIT_AMOUNT", nullable = false)
	@JsonProperty("security_deposit_amount")
    private Double securityDepositAmount = 0D;

    @Column(name = "ADVENCE_RENTAL_AMOUNT", nullable = false)
	@JsonProperty("advence_rental_amount")
    private Double advenceRentalAmount = 0D;

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

    @Column(name = "BOOKING_TYPE", nullable = false)
	@JsonProperty("booking_type")
    private Integer bookingType = 0;

    
}