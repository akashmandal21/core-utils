package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Table(name = "SALES_TRACKER")
@Entity
public class SalesTracker implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "AVAILABLE_BEDS")
    private Double availableBeds = 0D;

    @Column(name = "DEAD_BEDS")
    private Double deadBeds = 0D;

    @Column(name = "RESIDENCE_ID", nullable = false)
    private Integer residenceId;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
    private Integer propertyCategory;

    @Column(name = "RESIDENCE_NAME", nullable = false)
    private String residenceName;

    @Column(name = "MICROMARKET_ID", nullable = false)
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME", nullable = false)
    private String micromarketName;

    @Column(name = "CITY_ID", nullable = false)
    private Integer cityId;

    @Column(name = "CITY_NAME", nullable = false)
    private String cityName;

    @Column(name = "STATE_ID", nullable = false)
    private Integer stateId;

    @Column(name = "STATE_NAME", nullable = false)
    private String stateName;

    @Column(name = "ZONE_ID")
    private Integer zoneId = 0;

    @Column(name = "INVENTORY_IDS")
    private String inventoryIds;

    @Column(name = "LIVE_BEDS")
    private Double liveBeds = 0D;

    @Column(name = "AVERAGE_COMMITTED_LOCKIN")
    private Double averageCommittedLockin = 0D;

    @Column(name = "UNIQUE_SALES")
    private Double uniqueSales = 0D;

    @Column(name = "UPCOMING_TERMINATIONS")
    private Double upcomingTerminations = 0D;

    @Column(name = "UPCOMING_MOVE_INS")
    private Double upcomingMoveIns = 0D;

    @Column(name = "LIVE_BOOKINGS", nullable = false)
    private Integer liveBookings;

    @Column(name = "RUNNING_FORFEITURE", nullable = false)
    private Integer runningForfeiture;

    @Column(name = "CREATED", nullable = false)
    private LocalDate CREATED;

    @Column(name = "LIVE_OCCUPANCY")
    private Double liveOccupancy = 0D;

    @Column(name = "ONBOARDED_BEDS")
    private Integer onboardedBeds = 0;

    @Column(name = "FORWARD_GROSS_OCCUPANCY")
    private Double forwardGrossOccupancy = 0D;

    @Column(name = "FORWARD_NET_OCCUPANCY")
    private Double forwardNetOccupancy = 0D;

    @Column(name = "MTD")
    private Double MTD = 0D;

    @Column(name = "L7D")
    private Double L7D = 0D;

    @Column(name = "L3D")
    private Double L3D = 0D;

    @Column(name = "RETENTION_MTD")
    private Double retentionMtd = 0D;

    @Column(name = "RETENTION_L7D")
    private Double retentionL7d = 0D;

    @Column(name = "RETENTION_L3D")
    private Double retentionL3d = 0D;

    @Column(name = "AVERAGE_UNEXPIRED_LOCKIN")
    private Double averageUnexpiredLockin = 0D;

    @Column(name = "BOOKING_TYPE")
    private Integer bookingType;

    @Column(name = "BEDS_CS_NMI")
    private Double bedsCsNmi;

    
}