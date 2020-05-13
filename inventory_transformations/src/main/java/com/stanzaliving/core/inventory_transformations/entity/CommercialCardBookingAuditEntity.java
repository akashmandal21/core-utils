package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "COMMERCIAL_CARD_BOOKING_AUDIT")
@Entity
public class CommercialCardBookingAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "COMMERCIAL_CARD_ID")
	@JsonProperty("commercial_card_id")
    private Integer commercialCardId;

    @Column(name = "REFUNDABLE_SECURITY")
	@JsonProperty("refundable_security")
    private Double refundableSecurity = 0D;

    @Column(name = "MONTHLY_MAINTENANCE_FEE")
	@JsonProperty("monthly_maintenance_fee")
    private Double monthlyMaintenanceFee = 0D;

    @Column(name = "ANNUAL_MAINTENANCE_FEE")
	@JsonProperty("annual_maintenance_fee")
    private Double annualMaintenanceFee = 0D;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("advance_rental_months")
    private Integer advanceRentalMonths = 1;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
	@JsonProperty("variable_security_deposit")
    private Double variableSecurityDeposit = 0D;

    @Column(name = "CREATED_BY")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "UPDATED")
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    
}