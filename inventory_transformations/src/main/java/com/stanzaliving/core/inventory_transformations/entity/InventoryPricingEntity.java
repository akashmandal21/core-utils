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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "START_DATE")
	@JsonProperty("start_date")
    private Date startDate;

    @Column(name = "END_DATE")
	@JsonProperty("end_date")
    private Date endDate;

    @Column(name = "ROOM_ID")
	@JsonProperty("room_id")
    private Integer roomId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "INVENTORY_ID")
	@JsonProperty("inventory_id")
    private Integer inventoryId = 0;

    @Column(name = "ATTRIBUTES_PRICE")
	@JsonProperty("attributes_price")
    private Integer attributesPrice;

    @Column(name = "BASE_PRICE")
	@JsonProperty("base_price")
    private Integer basePrice;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("buffer_price")
    private Integer bufferPrice;

    @Column(name = "MANDATORY_SERVICES_PRICE")
	@JsonProperty("mandatory_services_price")
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE")
	@JsonProperty("room_price")
    private Integer roomPrice;

    @Column(name = "CGST")
	@JsonProperty("cgst")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("igst")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("sgst")
    private Double SGST;

    @Column(name = "STUDENT_ADMIN_CHARGES")
	@JsonProperty("student_admin_charges")
    private Integer studentAdminCharges;

    @Column(name = "STUDENT_NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("student_non_refundable_security_deposit")
    private Integer studentNonRefundableSecurityDeposit;

    @Column(name = "STUDENT_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("student_refundable_security_deposit")
    private Integer studentRefundableSecurityDeposit;

    @Column(name = "STUDENT_ADVANCE_RENTAL")
	@JsonProperty("student_advance_rental")
    private Integer studentAdvanceRental;

    @Column(name = "STUDENT_RETENTION_BOOKING_AMOUNT")
	@JsonProperty("student_retention_booking_amount")
    private Double studentRetentionBookingAmount;

    @Column(name = "STUDENT_MAINTENANCE_FEE")
	@JsonProperty("student_maintenance_fee")
    private Double studentMaintenanceFee;

    @Column(name = "STUDENT_PENALTY_AMOUNT")
	@JsonProperty("student_penalty_amount")
    private Double studentPenaltyAmount = 0D;

    @Column(name = "WP_ADMIN_CHARGES")
	@JsonProperty("wp_admin_charges")
    private Integer wpAdminCharges;

    @Column(name = "WP_NON_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("wp_non_refundable_security_deposit")
    private Integer wpNonRefundableSecurityDeposit;

    @Column(name = "WP_REFUNDABLE_SECURITY_DEPOSIT")
	@JsonProperty("wp_refundable_security_deposit")
    private Integer wpRefundableSecurityDeposit;

    @Column(name = "WP_ADVANCE_RENTAL")
	@JsonProperty("wp_advance_rental")
    private Integer wpAdvanceRental;

    @Column(name = "WP_RETENTION_BOOKING_AMOUNT")
	@JsonProperty("wp_retention_booking_amount")
    private Double wpRetentionBookingAmount;

    @Column(name = "WP_PENALTY_AMOUNT")
	@JsonProperty("wp_penalty_amount")
    private Double wpPenaltyAmount = 0D;

    @Column(name = "WP_MAINTENANCE_FEE")
	@JsonProperty("wp_maintenance_fee")
    private Double wpMaintenanceFee;

    @Column(name = "ENABLED")
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "VARIABLE_SECURITY_DEPOSIT")
	@JsonProperty("variable_security_deposit")
    private Double variableSecurityDeposit;

    @Column(name = "UPDATED")
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "PRORATED_MAINTENANCE_FEE")
	@JsonProperty("prorated_maintenance_fee")
    private Double proratedMaintenanceFee = 0D;

    @Column(name = "ROOM_METADATA")
	@JsonProperty("room_metadata")
    private Integer roomMetadata;

    @Column(name = "NUMBER_OF_BEDS")
	@JsonProperty("number_of_beds")
    private Float numberOfBeds;

    
}