package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "BOOKING_SERVICE_AUDIT")
@Entity
public class BookingServiceAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_SERVICE_AUDIT_ID", nullable = false)
	@JsonProperty("BOOKING_SERVICE_AUDIT_ID")
    private Integer bookingServiceAuditId;

    @Column(name = "OPTIONAL")
	@JsonProperty("OPTIONAL")
    private Boolean OPTIONAL;

    @Column(name = "PRICE")
	@JsonProperty("PRICE")
    private Double PRICE;

    @Column(name = "SERVICE_ID")
	@JsonProperty("SERVICE_ID")
    private Integer serviceId;

    @Column(name = "SERVICE_NAME")
	@JsonProperty("SERVICE_NAME")
    private String serviceName;

    @Column(name = "BOOKING_AUDIT_ID")
	@JsonProperty("BOOKING_AUDIT_ID")
    private Integer bookingAuditId;

    @Column(name = "VALID_FROM")
	@JsonProperty("VALID_FROM")
    private Timestamp validFrom;

    @Column(name = "VALID_TO")
	@JsonProperty("VALID_TO")
    private Timestamp validTo;

    @Column(name = "VAS")
	@JsonProperty("VAS")
    private Boolean VAS = Boolean.FALSE;

    
}