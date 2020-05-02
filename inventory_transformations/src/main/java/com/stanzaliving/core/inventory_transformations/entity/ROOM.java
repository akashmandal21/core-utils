package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "ROOM")
@Entity
public class ROOM implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "ROOM_ID", nullable = false)
    private Integer roomId;

    @Column(name = "BLOCKED")
    private Boolean BLOCKED;

    @Column(name = "CONVERTIBLE")
    private Boolean CONVERTIBLE;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "DEAD")
    private Boolean DEAD;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "FLOOR", nullable = false)
    private String FLOOR;

    @Column(name = "ROOM_NUMBER", nullable = false)
    private String roomNumber;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "ROOM_OCCUPANCY_ID")
    private Integer roomOccupancyId;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "ROOM_INITIAL_OCCUPANCY_ID")
    private Integer roomInitialOccupancyId;

    @Column(name = "BED_COUNT")
    private Integer bedCount;

    
}