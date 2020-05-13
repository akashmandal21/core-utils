package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "INVENTORY_ANALYTICS")
@Data
//@Entity
public class InventoryAnalyticsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "DATA_DATE")
	@JsonProperty("data_date")
    private Timestamp dataDate;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME;

    @Column(name = "TOTAL_BEDS")
	@JsonProperty("total_beds")
    private Integer totalBeds;

    @Column(name = "STUDENTS")
	@JsonProperty("students")
    private Integer STUDENTS;

    @Column(name = "OCCUPIED_BEDS")
	@JsonProperty("occupied_beds")
    private Integer occupiedBeds;

    @Column(name = "EMPTY_ROOMS")
	@JsonProperty("empty_rooms")
    private Integer emptyRooms;

    @Column(name = "OCCUPIED_ROOMS")
	@JsonProperty("occupied_rooms")
    private Integer occupiedRooms;

    @Column(name = "TOTAL_ROOMS")
	@JsonProperty("total_rooms")
    private Integer totalRooms;

    
}