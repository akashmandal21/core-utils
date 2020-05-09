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
	@JsonProperty("DATA_DATE")
    private Timestamp dataDate;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "TOTAL_BEDS")
	@JsonProperty("TOTAL_BEDS")
    private Integer totalBeds;

    @Column(name = "STUDENTS")
	@JsonProperty("STUDENTS")
    private Integer STUDENTS;

    @Column(name = "OCCUPIED_BEDS")
	@JsonProperty("OCCUPIED_BEDS")
    private Integer occupiedBeds;

    @Column(name = "EMPTY_ROOMS")
	@JsonProperty("EMPTY_ROOMS")
    private Integer emptyRooms;

    @Column(name = "OCCUPIED_ROOMS")
	@JsonProperty("OCCUPIED_ROOMS")
    private Integer occupiedRooms;

    @Column(name = "TOTAL_ROOMS")
	@JsonProperty("TOTAL_ROOMS")
    private Integer totalRooms;

    
}