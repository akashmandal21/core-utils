package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "ROOM")
public class RoomEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
	@JsonProperty("room_id")
    private Integer roomId;

    @Column(name = "BLOCKED")
	@JsonProperty("blocked")
    private Boolean BLOCKED;

    @Column(name = "CONVERTIBLE")
	@JsonProperty("convertible")
    private Boolean CONVERTIBLE;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "DEAD")
	@JsonProperty("dead")
    private Boolean DEAD;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "FLOOR", nullable = false)
	@JsonProperty("floor")
    private String FLOOR;

    @Column(name = "ROOM_NUMBER", nullable = false)
	@JsonProperty("room_number")
    private String roomNumber;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "ROOM_OCCUPANCY_ID")
	@JsonProperty("room_occupancy_id")
    private Integer roomOccupancyId;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "ROOM_INITIAL_OCCUPANCY_ID")
	@JsonProperty("room_initial_occupancy_id")
    private Integer roomInitialOccupancyId;

    @Column(name = "BED_COUNT")
	@JsonProperty("bed_count")
    private Integer bedCount;

    
}