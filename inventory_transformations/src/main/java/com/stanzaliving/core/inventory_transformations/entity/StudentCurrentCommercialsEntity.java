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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "BOOKING_ID", nullable = false)
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "ADMIN_CHARGES")
	@JsonProperty("admin_charges")
    private Double adminCharges;

    @Column(name = "MANDATORY_SERVICE_PRICE")
	@JsonProperty("mandatory_service_price")
    private Double mandatoryServicePrice;

    @Column(name = "NON_REFUNDABLE_SECURITY")
	@JsonProperty("non_refundable_security")
    private Double nonRefundableSecurity;

    @Column(name = "OPTIONAL_SERVICE_PRICE")
	@JsonProperty("optional_service_price")
    private Double optionalServicePrice;

    @Column(name = "REFUNDABLE_SECURITY")
	@JsonProperty("refundable_security")
    private Double refundableSecurity;

    @Column(name = "ROOM_PRICE")
	@JsonProperty("room_price")
    private Double roomPrice;

    @Column(name = "TOTAL_AMOUNT")
	@JsonProperty("total_amount")
    private Double totalAmount;

    @Column(name = "DISCOUNT_ID")
	@JsonProperty("discount_id")
    private String discountId;

    @Column(name = "CGST")
	@JsonProperty("cgst")
    private Double CGST;

    @Column(name = "IGST")
	@JsonProperty("igst")
    private Double IGST;

    @Column(name = "SGST")
	@JsonProperty("sgst")
    private Double SGST;

    @Column(name = "ADVANCE_RENTAL_MONTHS")
	@JsonProperty("advance_rental_months")
    private Integer advanceRentalMonths;

    @Column(name = "VAS_PRICE")
	@JsonProperty("vas_price")
    private Double vasPrice = 0D;

    @Column(name = "VERSION", nullable = false)
	@JsonProperty("version")
    private Integer VERSION;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "TYPE")
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "BUFFER_PRICE")
	@JsonProperty("buffer_price")
    private Double bufferPrice = 0D;

    
}