package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Table(name = "SALES_TRACKER")
@Entity
public class SalesTrackerEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "AVAILABLE_BEDS")
	@JsonProperty("AVAILABLE_BEDS")
    private Double availableBeds = 0D;

    @Column(name = "DEAD_BEDS")
	@JsonProperty("DEAD_BEDS")
    private Double deadBeds = 0D;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
	@JsonProperty("PROPERTY_CATEGORY")
    private Integer propertyCategory;

    @Column(name = "RESIDENCE_NAME", nullable = false)
	@JsonProperty("RESIDENCE_NAME")
    private String residenceName;

    @Column(name = "MICROMARKET_ID", nullable = false)
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME", nullable = false)
	@JsonProperty("MICROMARKET_NAME")
    private String micromarketName;

    @Column(name = "CITY_ID", nullable = false)
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "CITY_NAME", nullable = false)
	@JsonProperty("CITY_NAME")
    private String cityName;

    @Column(name = "STATE_ID", nullable = false)
	@JsonProperty("STATE_ID")
    private Integer stateId;

    @Column(name = "STATE_NAME", nullable = false)
	@JsonProperty("STATE_NAME")
    private String stateName;

    @Column(name = "ZONE_ID")
	@JsonProperty("ZONE_ID")
    private Integer zoneId = 0;

    @Column(name = "INVENTORY_IDS", columnDefinition = "text")
	@JsonProperty("INVENTORY_IDS")
    private String inventoryIds;

    @Column(name = "LIVE_BEDS")
	@JsonProperty("LIVE_BEDS")
    private Double liveBeds = 0D;

    @Column(name = "AVERAGE_COMMITTED_LOCKIN")
	@JsonProperty("AVERAGE_COMMITTED_LOCKIN")
    private Double averageCommittedLockin = 0D;

    @Column(name = "UNIQUE_SALES")
	@JsonProperty("UNIQUE_SALES")
    private Double uniqueSales = 0D;

    @Column(name = "UPCOMING_TERMINATIONS")
	@JsonProperty("UPCOMING_TERMINATIONS")
    private Double upcomingTerminations = 0D;

    @Column(name = "UPCOMING_MOVE_INS")
	@JsonProperty("UPCOMING_MOVE_INS")
    private Double upcomingMoveIns = 0D;

    @Column(name = "LIVE_BOOKINGS", nullable = false)
	@JsonProperty("LIVE_BOOKINGS")
    private Integer liveBookings;

    @Column(name = "RUNNING_FORFEITURE", nullable = false)
	@JsonProperty("RUNNING_FORFEITURE")
    private Integer runningForfeiture;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Date CREATED;

    @Column(name = "LIVE_OCCUPANCY")
	@JsonProperty("LIVE_OCCUPANCY")
    private Double liveOccupancy = 0D;

    @Column(name = "ONBOARDED_BEDS")
	@JsonProperty("ONBOARDED_BEDS")
    private Integer onboardedBeds = 0;

    @Column(name = "FORWARD_GROSS_OCCUPANCY")
	@JsonProperty("FORWARD_GROSS_OCCUPANCY")
    private Double forwardGrossOccupancy = 0D;

    @Column(name = "FORWARD_NET_OCCUPANCY")
	@JsonProperty("FORWARD_NET_OCCUPANCY")
    private Double forwardNetOccupancy = 0D;

    @Column(name = "MTD")
	@JsonProperty("MTD")
    private Double MTD = 0D;

    @Column(name = "L7D")
	@JsonProperty("L7D")
    private Double L7D = 0D;

    @Column(name = "L3D")
	@JsonProperty("L3D")
    private Double L3D = 0D;

    @Column(name = "RETENTION_MTD")
	@JsonProperty("RETENTION_MTD")
    private Double retentionMtd = 0D;

    @Column(name = "RETENTION_L7D")
	@JsonProperty("RETENTION_L7D")
    private Double retentionL7d = 0D;

    @Column(name = "RETENTION_L3D")
	@JsonProperty("RETENTION_L3D")
    private Double retentionL3d = 0D;

    @Column(name = "AVERAGE_UNEXPIRED_LOCKIN")
	@JsonProperty("AVERAGE_UNEXPIRED_LOCKIN")
    private Double averageUnexpiredLockin = 0D;

    @Column(name = "BOOKING_TYPE")
	@JsonProperty("BOOKING_TYPE")
    private Integer bookingType;

    @Column(name = "BEDS_CS_NMI")
	@JsonProperty("BEDS_CS_NMI")
    private Double bedsCsNmi;

    
}