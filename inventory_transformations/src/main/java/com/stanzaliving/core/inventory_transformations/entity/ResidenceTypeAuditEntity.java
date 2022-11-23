package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "RESIDENCE_TYPE_AUDIT")
@Data
@Entity
public class ResidenceTypeAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "RESIDENCE_TYPE_AUDIT_ID", nullable = false)
	@JsonProperty("RESIDENCE_TYPE_AUDIT_ID")
    private Integer residenceTypeAuditId;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("ADMIN_CHARGES")
    private Integer adminCharges;

    @Column(name = "NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer nonRefundableSecurityDeposit;

    @Column(name = "REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("REFUNDABLE_SECURITY_DEPOSIT")
    private Integer refundableSecurityDeposit;

    @Column(name = "ADVANCE_RENTAL")
	@JsonProperty("ADVANCE_RENTAL")
    private Integer advanceRental;

    @Column(name = "RETENTION_BOOKING_AMOUNT")
	@JsonProperty("RETENTION_BOOKING_AMOUNT")
    private Double retentionBookingAmount;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("TYPE")
    private Integer TYPE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "PENALTY_AMOUNT")
	@JsonProperty("PENALTY_AMOUNT")
    private Double penaltyAmount = 0D;

    @Column(name = "RESIDENCE_TYPE")
	@JsonProperty("RESIDENCE_TYPE")
    private Integer residenceType;

    @Column(name = "CREATED_BY")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    
}