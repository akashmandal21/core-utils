package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "INVENTORY_PRICING")
@Data
public class InventoryPricingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "START_DATE")
	@JsonProperty("START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
	@JsonProperty("END_DATE")
    private Date endDate;

    @Column(name = "ROOM_ID")
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("INVENTORY_ID")
    private Integer inventoryId = 0;

    @Column(name = "ATTRIBUTES_PRICE")
	@JsonProperty("ATTRIBUTES_PRICE")
    private Integer attributesPrice;

    @Column(name = "BASE_PRICE")
	@JsonProperty("BASE_PRICE")
    private Integer basePrice;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("BUFFER_PRICE")
    private Integer bufferPrice;

    @Column(name = "MANDATORY_SERVICES_PRICE")
	@JsonProperty("MANDATORY_SERVICES_PRICE")
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE")
	@JsonProperty("ROOM_PRICE")
    private Integer roomPrice;

    @Column(name = "CGST")
	@JsonProperty("CGST")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("IGST")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("SGST")
    private Double SGST;

    @Column(name = "STUDENT_ADMIN_CHARGES")
	@JsonProperty("STUDENT_ADMIN_CHARGES")
    private Integer studentAdminCharges;

    @Column(name = "STUDENT_NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("STUDENT_NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer studentNonRefundableSecurityDeposit;

    @Column(name = "STUDENT_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("STUDENT_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer studentRefundableSecurityDeposit;

    @Column(name = "STUDENT_ADVANCE_RENTAL")
	@JsonProperty("STUDENT_ADVANCE_RENTAL")
    private Integer studentAdvanceRental;

    @Column(name = "STUDENT_RETENTION_BOOKING_AMOUNT")
	@JsonProperty("STUDENT_RETENTION_BOOKING_AMOUNT")
    private Double studentRetentionBookingAmount;

    @Column(name = "STUDENT_MAINTENANCE_FEE")
	@JsonProperty("STUDENT_MAINTENANCE_FEE")
    private Double studentMaintenanceFee;

    @Column(name = "STUDENT_PENALTY_AMOUNT")
	@JsonProperty("STUDENT_PENALTY_AMOUNT")
    private Double studentPenaltyAmount = 0D;

    @Column(name = "WP_ADMIN_CHARGES")
	@JsonProperty("WP_ADMIN_CHARGES")
    private Integer wpAdminCharges;

    @Column(name = "WP_NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("WP_NON_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer wpNonRefundableSecurityDeposit;

    @Column(name = "WP_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("WP_REFUNDABLE_SECURITY_DEPOSIT")
    private Integer wpRefundableSecurityDeposit;

    @Column(name = "WP_ADVANCE_RENTAL")
	@JsonProperty("WP_ADVANCE_RENTAL")
    private Integer wpAdvanceRental;

    @Column(name = "WP_RETENTION_BOOKING_AMOUNT")
	@JsonProperty("WP_RETENTION_BOOKING_AMOUNT")
    private Double wpRetentionBookingAmount;

    @Column(name = "WP_PENALTY_AMOUNT")
	@JsonProperty("WP_PENALTY_AMOUNT")
    private Double wpPenaltyAmount = 0D;

    @Column(name = "WP_MAINTENANCE_FEE")
	@JsonProperty("WP_MAINTENANCE_FEE")
    private Double wpMaintenanceFee;

    @Column(name = "ENABLED")
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
	@JsonProperty("VARIABLE_SECURITY_DEPOSIT")
    private Double variableSecurityDeposit;

    @Column(name = "UPDATED")
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "PRORATED_MAINTENANCE_FEE")
	@JsonProperty("PRORATED_MAINTENANCE_FEE")
    private Double proratedMaintenanceFee = 0D;

    @Column(name = "ROOM_METADATA")
	@JsonProperty("ROOM_METADATA")
    private Integer roomMetadata;

    @Column(name = "NUMBER_OF_BEDS")
	@JsonProperty("NUMBER_OF_BEDS")
    private Float numberOfBeds;

    
}