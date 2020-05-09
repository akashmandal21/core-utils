package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "ROOM")
public class ROOMEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "BLOCKED")
	@JsonProperty("BLOCKED")
    private Boolean BLOCKED;

    @Column(name = "CONVERTIBLE")
	@JsonProperty("CONVERTIBLE")
    private Boolean CONVERTIBLE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "DEAD")
	@JsonProperty("DEAD")
    private Boolean DEAD;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "FLOOR", nullable = false)
	@JsonProperty("FLOOR")
    private String FLOOR;

    @Column(name = "ROOM_NUMBER", nullable = false)
	@JsonProperty("ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "ROOM_OCCUPANCY_ID")
	@JsonProperty("ROOM_OCCUPANCY_ID")
    private Integer roomOccupancyId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "ROOM_INITIAL_OCCUPANCY_ID")
	@JsonProperty("ROOM_INITIAL_OCCUPANCY_ID")
    private Integer roomInitialOccupancyId;

    @Column(name = "BED_COUNT")
	@JsonProperty("BED_COUNT")
    private Integer bedCount;

    
}