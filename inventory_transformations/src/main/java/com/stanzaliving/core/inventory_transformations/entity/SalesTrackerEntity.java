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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "AVAILABLE_BEDS")
	@JsonProperty("available_beds")
    private Double availableBeds = 0D;

    @Column(name = "DEAD_BEDS")
	@JsonProperty("dead_beds")
    private Double deadBeds = 0D;

    @Column(name = "RESIDENCE_ID", nullable = false)
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "PROPERTY_CATEGORY", nullable = false)
	@JsonProperty("property_category")
    private Integer propertyCategory;

    @Column(name = "RESIDENCE_NAME", nullable = false)
	@JsonProperty("residence_name")
    private String residenceName;

    @Column(name = "MICROMARKET_ID", nullable = false)
	@JsonProperty("micromarket_id")
    private Integer micromarketId;

    @Column(name = "MICROMARKET_NAME", nullable = false)
	@JsonProperty("micromarket_name")
    private String micromarketName;

    @Column(name = "CITY_ID", nullable = false)
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "CITY_NAME", nullable = false)
	@JsonProperty("city_name")
    private String cityName;

    @Column(name = "STATE_ID", nullable = false)
	@JsonProperty("state_id")
    private Integer stateId;

    @Column(name = "STATE_NAME", nullable = false)
	@JsonProperty("state_name")
    private String stateName;

    @Column(name = "ZONE_ID")
	@JsonProperty("zone_id")
    private Integer zoneId = 0;

    @Column(name = "INVENTORY_IDS", columnDefinition = "text")
	@JsonProperty("inventory_ids")
    private String inventoryIds;

    @Column(name = "LIVE_BEDS")
	@JsonProperty("live_beds")
    private Double liveBeds = 0D;

    @Column(name = "AVERAGE_COMMITTED_LOCKIN")
	@JsonProperty("average_committed_lockin")
    private Double averageCommittedLockin = 0D;

    @Column(name = "UNIQUE_SALES")
	@JsonProperty("unique_sales")
    private Double uniqueSales = 0D;

    @Column(name = "UPCOMING_TERMINATIONS")
	@JsonProperty("upcoming_terminations")
    private Double upcomingTerminations = 0D;

    @Column(name = "UPCOMING_MOVE_INS")
	@JsonProperty("upcoming_move_ins")
    private Double upcomingMoveIns = 0D;

    @Column(name = "LIVE_BOOKINGS", nullable = false)
	@JsonProperty("live_bookings")
    private Integer liveBookings;

    @Column(name = "RUNNING_FORFEITURE", nullable = false)
	@JsonProperty("running_forfeiture")
    private Integer runningForfeiture;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Date CREATED;

    @Column(name = "LIVE_OCCUPANCY")
	@JsonProperty("live_occupancy")
    private Double liveOccupancy = 0D;

    @Column(name = "ONBOARDED_BEDS")
	@JsonProperty("onboarded_beds")
    private Integer onboardedBeds = 0;

    @Column(name = "FORWARD_GROSS_OCCUPANCY")
	@JsonProperty("forward_gross_occupancy")
    private Double forwardGrossOccupancy = 0D;

    @Column(name = "FORWARD_NET_OCCUPANCY")
	@JsonProperty("forward_net_occupancy")
    private Double forwardNetOccupancy = 0D;

    @Column(name = "MTD")
	@JsonProperty("mtd")
    private Double MTD = 0D;

    @Column(name = "L7D")
	@JsonProperty("l7d")
    private Double L7D = 0D;

    @Column(name = "L3D")
	@JsonProperty("l3d")
    private Double L3D = 0D;

    @Column(name = "RETENTION_MTD")
	@JsonProperty("retention_mtd")
    private Double retentionMtd = 0D;

    @Column(name = "RETENTION_L7D")
	@JsonProperty("retention_l7d")
    private Double retentionL7d = 0D;

    @Column(name = "RETENTION_L3D")
	@JsonProperty("retention_l3d")
    private Double retentionL3d = 0D;

    @Column(name = "AVERAGE_UNEXPIRED_LOCKIN")
	@JsonProperty("average_unexpired_lockin")
    private Double averageUnexpiredLockin = 0D;

    @Column(name = "BOOKING_TYPE")
	@JsonProperty("booking_type")
    private Integer bookingType;

    @Column(name = "BEDS_CS_NMI")
	@JsonProperty("beds_cs_nmi")
    private Double bedsCsNmi;

    
}