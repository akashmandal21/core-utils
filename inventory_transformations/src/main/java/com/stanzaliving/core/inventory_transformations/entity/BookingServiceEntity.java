package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "BOOKING_SERVICE")
public class BookingServiceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_SERVICE_ID", nullable = false)
	@JsonProperty("BOOKING_SERVICE_ID")
    private Integer bookingServiceId;

    @Column(name = "OPTIONAL")
	@JsonProperty("OPTIONAL")
    private Boolean OPTIONAL;

    @Column(name = "PRICE")
	@JsonProperty("PRICE")
    private Integer PRICE;

    @Column(name = "SERVICE_ID")
	@JsonProperty("SERVICE_ID")
    private Integer serviceId;

    @Column(name = "SERVICE_NAME")
	@JsonProperty("SERVICE_NAME")
    private String serviceName;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "IS_ACTIVE")
	@JsonProperty("IS_ACTIVE")
    private Boolean active = Boolean.FALSE;

    @Column(name = "VAS")
	@JsonProperty("VAS")
    private Boolean VAS = Boolean.FALSE;

    
}