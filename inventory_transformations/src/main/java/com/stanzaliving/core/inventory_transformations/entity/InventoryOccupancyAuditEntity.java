package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "INVENTORY_OCCUPANCY_AUDIT")
@Entity
@Data
public class InventoryOccupancyAuditEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "START_DATE", nullable = false)
	@JsonProperty("START_DATE")
    private Timestamp startDate;

    @Column(name = "END_DATE", nullable = false)
	@JsonProperty("END_DATE")
    private Timestamp endDate;

    @Column(name = "ROOM_ID")
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "BOOKING_ID")
	@JsonProperty("BOOKING_ID")
    private Integer bookingId;

    @Column(name = "INVENTORY_ID", nullable = false)
	@JsonProperty("INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "UPDATED")
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    
}