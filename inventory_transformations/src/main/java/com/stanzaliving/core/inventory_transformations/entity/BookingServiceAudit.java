package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "BOOKING_SERVICE_AUDIT")
@Entity
public class BookingServiceAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "BOOKING_SERVICE_AUDIT_ID", nullable = false)
    private Integer bookingServiceAuditId;

    @Column(name = "OPTIONAL")
    private Boolean OPTIONAL;

    @Column(name = "PRICE")
    private Double PRICE;

    @Column(name = "SERVICE_ID")
    private Integer serviceId;

    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Column(name = "BOOKING_AUDIT_ID")
    private Integer bookingAuditId;

    @Column(name = "VALID_FROM")
    private LocalDateTime validFrom;

    @Column(name = "VALID_TO")
    private LocalDateTime validTo;

    @Column(name = "VAS")
    private Boolean VAS = Boolean.FALSE;

    
}