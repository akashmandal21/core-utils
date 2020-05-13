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
	@JsonProperty("booking_service_id")
    private Integer bookingServiceId;

    @Column(name = "OPTIONAL")
	@JsonProperty("optional")
    private Boolean OPTIONAL;

    @Column(name = "PRICE")
	@JsonProperty("price")
    private Integer PRICE;

    @Column(name = "SERVICE_ID")
	@JsonProperty("service_id")
    private Integer serviceId;

    @Column(name = "SERVICE_NAME")
	@JsonProperty("service_name")
    private String serviceName;

    @Column(name = "BOOKING_ID")
	@JsonProperty("booking_id")
    private Integer bookingId;

    @Column(name = "IS_ACTIVE")
	@JsonProperty("is_active")
    private Boolean active = Boolean.FALSE;

    @Column(name = "VAS")
	@JsonProperty("vas")
    private Boolean VAS = Boolean.FALSE;

    
}