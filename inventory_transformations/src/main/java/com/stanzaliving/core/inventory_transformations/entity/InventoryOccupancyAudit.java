package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "INVENTORY_OCCUPANCY_AUDIT")
@Data
public class InventoryOccupancyAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "END_DATE", nullable = false)
    private LocalDateTime endDate;

    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "BOOKING_ID")
    private Integer bookingId;

    @Column(name = "INVENTORY_ID", nullable = false)
    private Integer inventoryId;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    
}