package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "BOOKING_SERVICE")
public class BookingService implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_SERVICE_ID", nullable = false)
    private Integer bookingServiceId;

    @Column(name = "OPTIONAL")
    private Boolean OPTIONAL;

    @Column(name = "PRICE")
    private Integer PRICE;

    @Column(name = "SERVICE_ID")
    private Integer serviceId;

    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    @Column(name = "IS_ACTIVE")
    private Boolean active = Boolean.FALSE;

    @Column(name = "VAS")
    private Boolean VAS = Boolean.FALSE;

    
}