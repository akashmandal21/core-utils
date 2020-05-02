package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "ROOM_PRICING_AUDIT")
@Data
@Entity
public class RoomPricingAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ROOM_PRICING_AUDIT_ID", nullable = false)
    private Integer roomPricingAuditId;

    @Column(name = "ROOM_ID", nullable = false)
    private Integer roomId;

    @Column(name = "ATTRIBUTES_PRICE")
    private Integer attributesPrice;

    @Column(name = "BASE_PRICE", nullable = false)
    private Integer basePrice;

    @Column(name = "BUFFER_PRICE", nullable = false)
    private Integer bufferPrice;

    @Column(name = "MANDATORY_SERVICES_PRICE", nullable = false)
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE", nullable = false)
    private Integer roomPrice;

    @Column(name = "CGST")
    private Double CGST;

    @Column(name = "IGST")
    private Double IGST;

    @Column(name = "SGST")
    private Double SGST;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "CREATED_BY")
    private String createdBy;

    
}