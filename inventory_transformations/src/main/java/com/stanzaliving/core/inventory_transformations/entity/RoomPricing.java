package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "ROOM_PRICING")
@Data
@Entity
public class RoomPricing implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
    private Integer roomId;

    @Column(name = "ATTRIBUTES_PRICE")
    private Integer attributesPrice;

    @Column(name = "BASE_PRICE", nullable = false)
    private Integer basePrice;

    @Column(name = "BUFFER_PRICE", nullable = false)
    private Integer bufferPrice;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "MANDATORY_SERVICES_PRICE", nullable = false)
    private Integer mandatoryServicesPrice;

    @Column(name = "ROOM_PRICE", nullable = false)
    private Integer roomPrice;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "CGST")
    private Double CGST;

    @Column(name = "IGST")
    private Double IGST;

    @Column(name = "SGST")
    private Double SGST;

    
}