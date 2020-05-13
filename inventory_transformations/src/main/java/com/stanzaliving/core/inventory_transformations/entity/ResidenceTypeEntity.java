package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "RESIDENCE_TYPE")
@Entity
@Data
public class ResidenceTypeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_TYPE_ID", nullable = false)
	@JsonProperty("residence_type_id")
    private Integer residenceTypeId;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("admin_charges")
    private Integer adminCharges;

    @Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("non_refundable_security_deposit")
    private Integer nonRefundableSecurityDeposit;

    @Column(name = "REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("refundable_security_deposit")
    private Integer refundableSecurityDeposit;

    @Column(name = "ADVANCE_RENTAL")
	@JsonProperty("advance_rental")
    private Integer advanceRental;

    @Column(name = "RETENTION_BOOKING_AMOUNT")
	@JsonProperty("retention_booking_amount")
    private Double retentionBookingAmount;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("type")
    private Integer TYPE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "PENALTY_AMOUNT")
	@JsonProperty("penalty_amount")
    private Double penaltyAmount = 0D;

    @Column(name = "MAINTENANCE_FEE")
	@JsonProperty("maintenance_fee")
    private Double maintenanceFee = 0D;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
	@JsonProperty("variable_security_deposit")
    private Double variableSecurityDeposit;

    
}