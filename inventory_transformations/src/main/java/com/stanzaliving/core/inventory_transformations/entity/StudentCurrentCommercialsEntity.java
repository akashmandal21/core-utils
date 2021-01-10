package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "STUDENT_CURRENT_COMMERCIALS")
@Entity
@Data
public class StudentCurrentCommercialsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "BOOKING_ID", nullable = false)
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("ADMIN_CHARGES")
    private Double adminCharges;

    @Column(name = "MANDATORY_SERVICE_PRICE")
	@JsonProperty("MANDATORY_SERVICE_PRICE")
    private Double mandatoryServicePrice;

    @Column(name = "NON_REFUNDABLE_SECURITY")
	@JsonProperty("NON_REFUNDABLE_SECURITY")
    private Double nonRefundableSecurity;

    @Column(name = "OPTIONAL_SERVICE_PRICE")
	@JsonProperty("OPTIONAL_SERVICE_PRICE")
    private Double optionalServicePrice;

    @Column(name = "REFUNDABLE_SECURITY")
	@JsonProperty("REFUNDABLE_SECURITY")
    private Double refundableSecurity;

    @Column(name = "ROOM_PRICE")
	@JsonProperty("ROOM_PRICE")
    private Double roomPrice;

    @Column(name = "TOTAL_AMOUNT")
	@JsonProperty("TOTAL_AMOUNT")
    private Double totalAmount;

    @Column(name = "DISCOUNT_ID")
	@JsonProperty("DISCOUNT_ID")
    private String discountId;

    @Column(name = "CGST")
	@JsonProperty("CGST")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("IGST")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("SGST")
    private Double SGST;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("ADVANCE_RENTAL_MONTHS")
    private Integer advanceRentalMonths;

    @Column(name = "VAS_PRICE")
	@JsonProperty("VAS_PRICE")
    private Double vasPrice = 0D;

    @Column(name = "VERSION", nullable = false)
	@JsonProperty("VERSION")
    private Integer VERSION;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "TYPE")
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("BUFFER_PRICE")
    private Double bufferPrice = 0D;

    
}