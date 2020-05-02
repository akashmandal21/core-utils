package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "INVENTORY_ANALYTICS")
public class InventoryAnalytics implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "DATA_DATE")
    private LocalDateTime dataDate;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "NAME")
    private String NAME;

    @Column(name = "TOTAL_BEDS")
    private Integer totalBeds;

    @Column(name = "STUDENTS")
    private Integer STUDENTS;

    @Column(name = "OCCUPIED_BEDS")
    private Integer occupiedBeds;

    @Column(name = "EMPTY_ROOMS")
    private Integer emptyRooms;

    @Column(name = "OCCUPIED_ROOMS")
    private Integer occupiedRooms;

    @Column(name = "TOTAL_ROOMS")
    private Integer totalRooms;

    
}